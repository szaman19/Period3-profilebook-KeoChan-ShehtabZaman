import java.util.*;

public class Profile{

    public ArrayList<Profile> friendslist; 
    public String name; 
    public int age; 
    public String password; 
    //public String status; 
    //public String birthday; 
    //public Arraylist<String> interests; 
    
    public Profile(){
	ProfileMaker();
    }
    
    public void ProfileMaker(){ 
	System.out.println("please enter your name");
	Scanner entry = new Scanner(System.in);
	String name = entry.nextLine(); 
	
	System.out.println("please enter your age");
	Scanner entry2 = new Scanner(System.in);
	int age = entry2.nextInt();
	
        System.out.println("please enter your password");
	Scanner entry3 = new Scanner(System.in);
	String password = entry.nextLine();
	
	this.name = name;
	this.password = password;  
	this.age = age; 
    }

    public boolean equals(Profile other){
	if(!(other instanceof Profile)){
	    return false;
	}
	//may not work
	return true;
    }

    public boolean isFriends(Profile friend){
	for(int i = 0; i < friendslist.size(); i++){
	    if(equals(friend)){
		return true;
	    }
	}
	return false;
    }


}
