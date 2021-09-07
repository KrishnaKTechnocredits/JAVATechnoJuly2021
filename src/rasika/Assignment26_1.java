package rasika;

/*WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT     */

public class Assignment26_1 {
	
	String revStringWord(String input) {
		String name ="";
		
		for(int index = input.length()-1; index >= 0; index--) {
			name = name + input.charAt(index);
		}
		return name;
	}
	
	String[] takeString(String input) {
		String[] arr = input.split(" ");
		int count = 0;
		
		for(int index = 0; index < arr.length; index++) {
			arr[count] = revStringWord(arr[index]);
			count++;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Assignment26_1 assignment26_1 = new Assignment26_1();
		String input = "This is technocredits";
		String[] stringArr = assignment26_1.takeString(input);
		
		System.out.print("String in Reverse Order : ");
		
		for(int index = stringArr.length-1; index >= 0; index--) {
			System.out.print(stringArr[index] + " ");
		}
	}
}

