import java.util.*;

public class testProfile{

	//public ArrayList<Profile> friendslist; 
	public String name; 
	public int age; 
	public String password; 
	//public String status; 
	//public String birthday; 
	//public Arraylist<String> interests; 
	
	public testProfile(String n, String p, int a){
 		//test for if profile already exists
 		//ProfileMaker();
 		name = n; 
 		password = p; 
 		age = a; 
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
public String toString(){
	return (name + " " + age);
}
	//add friendslist
	//add the other comments - shehtab 

}