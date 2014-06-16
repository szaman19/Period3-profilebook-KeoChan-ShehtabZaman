public class StringValue implements Comparable< StringValue> {
	int x ; 
	Profile y ; 

	public StringValue(int nums, Profile strs){
		x = nums; 
		y = strs; 
	}  

	public int getX(){
		return x; 
	}
	public Profile getProfile(){
		return y;
	}

	public int compareTo(StringValue ii){
		int ans = 0;

		if (x < ii.getX()) {
			ans =  -1; 
		}
		else if (x == ii.getX()) {
			ans = 0; 
		}
		else if (x > ii.getX()) {
			ans = 1; 
		}
		return ans;
	}
}