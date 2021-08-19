package suchita;

class Assignment15_1 {

	char[] getMiddleChar(String[] arr) {
		char midChar[]=new char[3] ;
		for(int index=0;index<arr.length;index++){
			int num = (arr[index].length()) / 2;
			midChar[index] = arr[index].charAt(num);
			
		}
			
		return midChar;
		
	}
	
	public static void main(String[] args) {
		
		String[] arr = {"hello" , "techno" , "credits"};
		Assignment15_1 assignment = new Assignment15_1();
		System.out.println("Middle character of all elements of the given string array :: ");
		System.out.println(assignment.getMiddleChar(arr));
		
	}	
}