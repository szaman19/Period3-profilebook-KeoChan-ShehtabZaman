//match algorithm 
import java.util.*; 
import java.text.*;
public class MatchAlgorithm{
	public ArrayList<Profile> friends;
	//public Profile self;  
	public ArrayList<String> interests; 
	public ArrayList<StringValue> commons; 

	public MatchAlgorithm(ArrayList<Profile> x , ArrayList<String> y ){

		friends = x; 
		interests = y; 

	}
//	public MatchAlgorithm(Profile c , ){

//	}

	public boolean equals(Profile other, Profile other2){
		if(other.ownName() == other2.ownName())
			{
				if (other.ownAge() == other2.ownAge()) {
					return true; 
			}
			}
	    		return false; 
		}

	//public 

	public void match(){
		String temp = ""; 
		ArrayList<Profile> tempA = new ArrayList<Profile>();


		//for (int i = 0; i < interests.size(); i ++ ) {
		//	temp = interests.get(i); 

				int nums = 0;
				for (int b = 0; b < friends.size(); b++) { //get all the friends in the friendslist
					
					Profile tempP = friends.get(b); // take a friend
				

						for (int x = 0; x < tempP.getFriendsList().size(); x++) { //look at the friends friends list 
							Profile tempP2 = tempP.getFriendsList().get(x); //take a friend 
								
								for (int g = 0; g < friends.size() ; g ++ ) {//get all friends
									
									if (equals(friends.get(g) , tempP2)) { // see if they have the same friends  
									nums++; //
									}
								}

						
						}
						StringValue tempV = new StringValue(nums, tempP); 
						commons.add(tempV); 
				}



		//}

	}

}