package kumar_Ashish;

import java.util.Arrays;

public class ReverseArrayString {
	void getRevString(String[] inputStatement){
		//String[] input = {"Credits","Techno","From","Diwali","Happy"};
		
		String[] output = new String[inputStatement.length];
		
		for(int index = inputStatement.length-1; index >=0; index--){
			
			output[index-4] = inputStatement[index];
			
			
		}
		System.out.println(Arrays.toString(output));
		
	
	}
	
	public static void main(String[] args){
		ReverseArrayString revStrng= new ReverseArrayString();
		String[] input = {"Credits","Techno","From","Diwali","Happy"};
		revStrng.getRevString(input);

	}


}
