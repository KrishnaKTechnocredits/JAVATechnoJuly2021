package priti;
//program 3 : Find minimum word length from given statement.
//input = "good morning technocredits hi hello";
//output : hi

public class Assingment_19_3 {
	
	String getminiumWordFromString() {
		String input=  "good morning technocredits hi hello";
		String[] arr= input.split(" ");
		String minimumWord= arr[0];
		for(int index=0; index<arr.length;index++) {
			if(minimumWord.length()>arr[index].length()) {
				minimumWord= arr[index];
			}
		}return	minimumWord;
			
	}

	public static void main(String[] args){
		Assingment_19_3 assingment_19_3 = new Assingment_19_3();
		System.out.println(" Minimum word ="+assingment_19_3.getminiumWordFromString());
	}
		
}
			
			
		
		
	
	
	
	
	
	
	
	
	
	
	


