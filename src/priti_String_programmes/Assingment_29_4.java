package priti_String_programmes;

public class Assingment_29_4 {
	/*program 3 : given number is pallindrome or not, without converting it input into String?
	 int num = 12321;
	 ans : true  
	Hint : % and /*/
	void findifNumberispallindrome() {
		 int num = 12321;
		 int reverseNum=0;
		 int remainderNnum=0;
		 while(num>0) {
			 remainderNnum =num%10;
			reverseNum= reverseNum*10+remainderNnum;
			num=num/10;
		}
		 System.out.println("Reverse number is :"+reverseNum);
	}	
	
	
	public static void main(String[] a) {
			 Assingment_29_4 assingment_29_4 = new Assingment_29_4(); 
			 assingment_29_4.findifNumberispallindrome();
		 }
}		 
		 
		
	
	
	
	


