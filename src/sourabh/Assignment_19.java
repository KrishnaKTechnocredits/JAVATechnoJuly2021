package sourabh;

public class Assignment_19{

	//program 1: Find how many words in a given statement.
	 void getNumberOfWordFromString(String srt1) {
		 	srt1= srt1.replace("  "," "); 
			String[] arr1=srt1.split(" ");
			System.out.println("Number of words: "+arr1.length);
	 }
	 ///program 2: Find maximum word length from given statement.
	 void getMaxWordFromString() {
		 String sr1= "Nestle is worldwide brand";
		 String[] arry=sr1.split(" ");
		 String maxword="";
		 int max= 0;
		 for (int index=0; index< arry.length  ; index++) {
			  int l=arry[index].length();
			  if (max<l) {
				  max=l; 
			  	  maxword= arry[index];
			  }				
		 }
		 System.out.println("Word with maximum lenght is: "+maxword);
	 }

	 //program 3 : Find minimum word length from given statement.
	 void getMinWordFromString() {
		 String sr1= "India is fast growing country";
		 String[] arry=sr1.split(" ");
		 String miniword="";
		 int min= arry[0].length();
		 for (int index=0; index< arry.length  ; index++) {

			  if (min>arry[index].length()) {
				  min=arry[index].length(); 
				  miniword= arry[index];
			  }				
		 }
		 System.out.println("Word with minium lenght is: "+miniword);
	 }

	 //program 4: sum of all numbers in given statement.
	 void getSumINtArray() {
		 String srt ="10 25 38 73";
		 String[] num= srt.split(" ");
		 int sum=0;
		 for (int index=0; index< num.length; index++) {
			 int number= Integer.parseInt(num[index]);
			 sum= number +number;
		 }
		 System.out.println("Sum of interger of is:  "+sum);

	 }

	public static void main(String[] hsghs) {
		 String srt2= "Enjoy the every moment of life";
		Assignment_19 assignment_19 = new Assignment_19();
		assignment_19.getNumberOfWordFromString(srt2);
		assignment_19.getMaxWordFromString();
		assignment_19.getMinWordFromString();
		assignment_19.getSumINtArray();

	}	

}