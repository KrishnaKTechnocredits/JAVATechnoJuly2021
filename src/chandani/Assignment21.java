package chandani;

public class Assignment21 {

	int GetMinMaxAge(int[] input){
		int youngermem = 0;
		int eldermem = 0;
		for(int index = 0; index < input.length; index++){
			if(input[index] > eldermem)
				eldermem = input[index];
			else if (input[index] < eldermem)
				youngermem = input[index];
		}
		return  eldermem - youngermem;
	}
	
	public static void main(String[] args){
		int[] arr = {10,34,38,68,72,95,6};
		Assignment21 assignment21 = new Assignment21();		
		System.out.println("Difference of Younger and older age person is " + assignment21.GetMinMaxAge(arr));
	}
}
