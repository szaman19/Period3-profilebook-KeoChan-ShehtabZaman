import java.util.*;

public class Driver{

public static ArrayList<Profile> testArray = new ArrayList<Profile> ( ); 
	public static void main(String[] args) {
		for (int a = 0; a < 100 ; a++ ) {
			testProfile x = new testProfile("ss", "sa", a);
			testArray.add(x); 	
		}
		status n = new status("sadsdads");
		System.out.println(n);  
		//System.out.println(testArray);
		//System.out.println(x.name); 
		//System.out.println(x.age); 
		//System.out.println(x.password);
	}
}