//Assignment - 19 : 20th Aug'2021
//
//program 1: Find how many words in a given statement.
//input = "Hi Techno Credits Hello"
//output : 4
//
//program 2: Find maximum word length from given statement.
//input = "good morning technocredits hi hello";
//output : technocredits
//
//program 3 : Find minimum word length from given statement.
//input = "good morning technocredits hi hello";
//output : hi
//
//program 4: sum of all numbers in given statement.
//input = "10 10 20 30";
//output : 70
//compire ::  check systex , java file conver .class .. rund .class get run 


package bhakti;

public class Scanner_ex {
	
	//program 1: Find how many words in a given statement.
	 void getNumberOfWordFromString(String srt1) {
		 	srt1= srt1.replace("  "," "); 
			String[] arr1=srt1.split(" ");
			System.out.println("Number of words: "+arr1.length);
	 }
	 ///program 2: Find maximum word length from given statement.
	 void getMaxWordFromString() {
		 String sr1= "BNtSOft is veryverybig comp";
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
		 String sr1= "BNtSOft is a veryverybig comp";
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
		 String srt ="10 10 20 30";
		 String[] num= srt.split(" ");
		 int sum=0;
		 for (int index=0; index< num.length; index++) {
			 int number= Integer.parseInt(num[index]);
			 sum= number +number;
		 }
		 System.out.println("Sum of interger of is:  "+sum);
		 
	 }
	 
	 
	// below main  method entry point while running the code 
	public static void main(String[] hsghs) {
		 String srt2= "Priya is best employee";
		Scanner_ex assignment_19_StringWord = new Scanner_ex();
		assignment_19_StringWord.getNumberOfWordFromString(srt2);
		assignment_19_StringWord.getMaxWordFromString();
		assignment_19_StringWord.getMinWordFromString();
		assignment_19_StringWord.getSumINtArray();
		
	}	

}
