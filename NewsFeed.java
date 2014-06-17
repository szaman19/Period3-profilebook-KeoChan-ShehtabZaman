import java.util.*; 
import java.io.*; 

public class NewsFeed{
	//should it be static???
	//take profiles
	//add suser freindly terminal commands 

	public static String openingScene(){
			System.out.println("What would you like to do? (Type the letter)"); 
		System.out.println("a) View NewsFeed"); 
		System.out.println("b) Add Friend"); 
		System.out.println("c) View Friends");
		System.out.println("d) Show Statuses"); 
		Scanner sc2 = new Scanner(System.in);
		String pw = sc2.nextLine();
		return pw; 
	}
	public static void main(String[] args) {
		Profile x = new Profile(); 
		//x.Profile
		String pw = openingScene(); 
		
		if (pw == "a") {
			System.out.println(x.getNewsfeed()); 
			pw = openingScene(); 
		}
		//else if (pw == "b") {

		//	 System.out.println(x.addFriend()); 
		//}
		else if (pw == "c") {
			System.out.println(x.getFriendsList());
			pw = openingScene();
		}
		else if (pw == "d") {
			System.out.println(x.getStatus()); 
			pw = openingScene();
		}

	}

}