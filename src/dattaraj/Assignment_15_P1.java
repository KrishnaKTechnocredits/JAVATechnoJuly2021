package dattaraj;

public class Assignment_15_P1 {
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
		difference = evenLength - oddLength;  
		System.out.println("difference of even length name and odd lenght name:" + difference);
	}

	public static void main(String[] args) {

		String[] arr = {"Maulik", "Techno", "Nidhi","Ankit"};

		Assignment_15_P1 pgm1 = new Assignment_15_P1();
		pgm1.diffLengthName(arr);
		pgm1.difference();

	}
}
