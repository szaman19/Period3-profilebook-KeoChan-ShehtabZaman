import java.util.*;

public class Profile{



    public ArrayList<Profile> friendslist; 
    protected String name; 
    protected int age; 
    protected String password; 
    protected String status; 
    //public String birthday; 
    //public Arraylist<String> interests; 
    
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

    public int getAge(Profile p){
	if(isFriends(p)){
	    return age;
	}else{
	    return -1;

    }

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
