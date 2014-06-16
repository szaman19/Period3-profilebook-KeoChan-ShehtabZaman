import java.util.*;

public class Profile{



    public ArrayList<Profile> friendslist; 
    protected String name; 
    protected int age; 
    protected String password; 

    protected String status;
    protected ArrayList<status> stats;  

    protected sta sta; 

    //public String birthday; 
    //public Arraylist<String> interests; 
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
    public String getStatus(){
    	return status; 
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
			friendslist.add(friend); 
		}
		else{
			System.out.println("already connected"); 
		}
	}g

    public boolean isFriends(Profile friend){

    	boolean ans = false; 
    	int counter = 0; 
    	while(ans && counter < friendslist.size()){
    		if(equals(friend, friendslist.get(counter))){
    			ans = true; 
    			counter ++; 
    		}
    		
    	}
    	return ans; 
    }
    //LOOK AT THIS KEO
    //going to add algorithm to order friends 
    //and then get the statuses from taht 

    public String getNewsfeed(){
	String nf = "";
	ArrayList<status> temp = new ArrayList<status>();
	for(int i = 0; i < friendsList.size(); i++){
	    temp.add(friendsList.get(i).getStatus());
	}
	//order statuses and add to nf
	return nf;
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
    public boolean logIn(){

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

	//add friendslist
	//add the other comments - shehtab 

}
