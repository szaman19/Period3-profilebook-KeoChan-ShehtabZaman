import java.util.*; 
import java.text.*;
public class status{
	public String st;
	public Calendar time; 
	public status(String s) {
		st = s; 
		Calendar cal = Calendar.getInstance();
    	time = cal.getInstance(); 
    	
	}
	public String toString(){
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    	//System.out.println( sdf.format(cal.getTime()) )
		String ans = "username : " + st + "\n" + "Posted on: " + (String) (sdf.format(time.getTime())); 
		return ans;
	}
}