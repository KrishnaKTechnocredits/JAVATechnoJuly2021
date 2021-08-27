package harshada;

public class Assignment_19_Program_3 {

	void getMinimumWordLength(String input) {
		input=input.replace(',', ' ').replace('.',' ').replace("  "," ").replace('-',' ');		//replace characters by space
		String array[]=input.split(" ");//now split string by space, use double quotes
		
		int minSize=array[0].length();
		String minWord=array[0];
		for(int index=0; index< array.length ; index++) {
		
			if(array[index].length() < minSize) {
				minSize=array[index].length();;
				minWord=array[index];
			}
		}
		System.out.println("String is: "+ input);
		System.out.println("Size of the Minimum word is= : "+ minSize);
		System.out.println("Word of minimum length is= : "+ minWord + "\n");
	}
	
	public static void main(String a[]) {
		Assignment_19_Program_3 assignment_19_P3=new Assignment_19_Program_3();
		String input1="Hi .Harshada ,Deorankar";
		assignment_19_P3.getMinimumWordLength(input1);
		String input2="State Bank of India is in Mumbai, Maharashtra.";
		assignment_19_P3.getMinimumWordLength(input2);
	}
}


