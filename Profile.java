import java.util.*;

public class Profile{



    public ArrayList<Profile> friendsList; 
    protected String name; 
    protected int age; 
    protected String password;
    protected ArrayList<String> interests = new ArrayList<String>();
//<<<<<<< HEAD
    protected String status;
    protected ArrayList<status> stats;   

    //public String birthday;  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    public Profile(){
	ProfileMaker();
    }

    public String getName(Profile p){
	if(isFriends(p)){
	    return name;
	}else{
	    return "Not available";
	}
    }
    public String ownName(){
    	return name; 
    }
    public int ownAge(){
    	return age; 
    }

    public int getAge(Profile p){
	if(isFriends(p)){
	    return age;
	}else{
	    return -1;

    }
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void print(){
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println(status);
    }

    public void setStatus(){
	System.out.println("Type your status below.\n");
	Scanner sc = new Scanner(System.in);
	status = sc.nextLine();
    }
    public status getStatus(){
    	return stats.get(0); 
    }
    public ArrayList<Profile> getFriendsList(){
    	return friendsList;
    }

 //////////////////////////////////////////////////////////////////////////////////////////////////////////////   
    public void ProfileMaker(){ 
    System.out.println("Hi! Welcome to match, connect with your friends and see how well you match up. ");
	System.out.println("Please enter your name");
	Scanner entry = new Scanner(System.in);
	String name = entry.nextLine(); 
	
	System.out.println("Please enter your age");
	Scanner entry2 = new Scanner(System.in);
	int age = entry2.nextInt();
	
        System.out.println("Please enter your password");
	Scanner entry3 = new Scanner(System.in);
	String password = entry.nextLine();
	
	this.name = name;
	this.password = password;  
	this.age = age; 
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean equals(Profile other, Profile other2){
	if(other.ownName() == other2.ownName())
		{
			if (other.ownAge() == other2.ownAge()) {
				return true; 
			}
		}
	    	return false; 
		}
	  //  }
	//may not work
	    //what is this supposed to do? - Shehtab
	//return true;
    //}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
	public void addFriend(Profile friend ){
		if(!(isFriends(friend))){
			friendsList.add(friend); 
		}
		else{
			System.out.println("already connected"); 
		}
	}

    public boolean isFriends(Profile friend){

    	boolean ans = false; 
    	int counter = 0; 
    	while(ans && counter < friendsList.size()){
    		if(equals(friend, friendsList.get(counter))){
    			ans = true; 
    			counter ++; 
    		}
    		
    	}
    	return ans; 
    }

    public String getNewsfeed(){
	String nf = "";

	MatchAlgorithm x = new MatchAlgorithm(friendsList, interests);
	x.match(); 
	x.order(); 
	friendsList = x.orderedFriends();  

	ArrayList<status> temp = new ArrayList<status>();
	for(int i = 0; i < friendsList.size(); i++){
	    temp.add(friendsList.get(i).getStatus());
	}
	//order statuses and add to nf
	return nf;
    }



    public void setInterests(){
    	Scanner sc = new Scanner(System.in);
    	String temp = sc.nextLine();

    	interests.add(temp);
    }

    public void printInterests(){
    	for(int i = 0; i < interests.size(); i++){
    		System.out.println(interests.get(i));
    	}
    }


/*




	for(int i = 0; i < friendslist.size(); i++){
	    if(equals(friend, friendslist.get(i))){
		return true;
	    }
	}
	return false;
    }
    */
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public boolean logIn(){ //log in has to be changed so it equals password to a password saved on a text file; 

	System.out.println("Password:");
	Scanner sc2 = new Scanner(System.in);
	String pw = sc2.nextLine();
	if(pw.equals(password)){
	    System.out.println("Log in successful");
	    return true;
	}else{
	    System.out.println("Log in failed.");
	    return false;

	}
    }

<<<<<<< HEAD
    /*
    public void fileWriter(){
    	this writes all the info in the profile i.e friends list, interest, name ,password on a text file. 

    }

    public profile getData(){
		this takes the info from the text file and creates a profile out of it. we can use that to do login and what not. 
		This can go into newsfeed actually. 
    }
    */ 



=======

    public void toText(){
    	ArrayList<String> data = new ArrayList<String<>();
    	data.add("Name: "+name);
    	data.add("Age: "+age);
    	data.add("Password: "+password);
    	String temp = "Interests:";
    	for(int i = 0; i < interests.size(); i++){
    		temp += " "+interets.get(i);
    	}
    	data.add(temp);
    	data.add("Status: "+status);

    	for(int i = 0; i < data.size(); i++){
    		//take data.get(i) and write into a new line of text file
    	}
    }
>>>>>>> 21eb76a2f3e73540eac8920b00390096a9a16554
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //																								  	   	 //
    //																										//
    //KEO WE HAVE TO WRITE THE PROFILES INTO A TEXT FILE 											       //
    //We write the info into the files then take them out again each time we call a command 			  //														  //
    //																								     //
    //																								    //
    //																								   //
    //																								  //
    //																								 //
    //////////////////////////////////////////////////////////////////////////////////////////////////

	//add friendslist
	//add the other comments - shehtab 

}
