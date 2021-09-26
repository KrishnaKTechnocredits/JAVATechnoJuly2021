package priti;

public class Assingment_19_2 {
	int  maxLength=0;
	String ouput;

	String  getMaxWordStrength() {
		String input = "good morning technocredits hi hello";
		String[] str = input.split(" ");
		String maxword= str[0];
		for(int index =0 ; index<str.length; index++){		
			if (maxword.length()<str[index].length()) 
				maxword = str[index];
		}	return maxword;
		 
	}			
				

		
		
	public static void main(String[] a) {
		Assingment_19_2 assingment_19_2 = new Assingment_19_2();
		System.out.println(" Maximum word ="+assingment_19_2.getMaxWordStrength());
	}	
}	
		
	
	
	
	
	
	


