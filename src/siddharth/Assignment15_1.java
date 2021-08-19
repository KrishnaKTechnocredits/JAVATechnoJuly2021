package siddharth;

public class Assignment15_1 {
	int difference;
	int evenLength;
	int oddLength;
	
	void diffLengthName(String[] arr){
		
		for(int index=0;index<arr.length;index++){
			if(arr[index].length()%2 == 0){
				evenLength = evenLength + arr[index].length();
			}
			else{
				oddLength = oddLength + arr[index].length();
			}
		}
	}

	void difference(){
		difference = evenLength - oddLength;  // 12 - 8 = 4
		System.out.println("difference of even length name and odd lenght name:" + difference);
	}
	
	public static void main(String[] args) {
	
		String[] arr = {"Maulik", "Techno", "Ram","Lucky"};
		
		Assignment15_1 program1 = new Assignment15_1();
		program1.diffLengthName(arr);
		program1.difference();
		
	}
}
