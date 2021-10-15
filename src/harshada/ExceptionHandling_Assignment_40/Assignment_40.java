package harshada.ExceptionHandling_Assignment_40;

import harshada.AssignmentNo40;

public class Assignment_40 {
	
	
	void getNumbersFromString(String str) {
		
		String strArr[]=str.split(" ");
		System.out.println("Input String ="+ str);
		System.out.println("Numbers in Given String are as follows: ");
		for(int i=0; i< strArr.length; i++) {
			try {
				int num=Integer.parseInt(strArr[i]);
				System.out.println(num);	
			}catch(NumberFormatException e) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_40 assignment_40=new Assignment_40();
		String str = "I have 15 years and 3 months of experience";
		assignment_40.getNumbersFromString(str);
	}

}


