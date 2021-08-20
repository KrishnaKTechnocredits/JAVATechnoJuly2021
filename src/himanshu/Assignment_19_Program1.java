package himanshu;

public class Assignment_19_Program1 {
	
	void usingSpiltMethod(String input){
		int count=0;
		String[] arr = input.split(" ");
		for(int index=0;index<arr.length;index++){
			//System.out.println(arr[index]);
			count++;
		}
		System.out.println("Total word are present in the String is : " + count);
		
	}

	public static void main(String[] args) {

		String input = "Hi Techno Credits Hello";
		
		Assignment_19_Program1 program1 = new Assignment_19_Program1();
		//program1.wordsCount(input);
		program1.usingSpiltMethod(input);
		
	}

}


