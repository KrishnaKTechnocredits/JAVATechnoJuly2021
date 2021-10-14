package pritiProgrammesOnNumbers;

public class Assingment_30_1 {
	void reverseNum() {
		int num =1932;
		int reverseNum=0;
		int remiandernum=0;
		while(num>0) {
			remiandernum=num%10;
			//System.out.println(remiandernum);
			reverseNum=(reverseNum*10)+remiandernum;
			num=num/10;
		}
		System.out.println("Reverse Number of Given number 1932 is :"+reverseNum);
	}
	
	
	public static void main(String[] a) {
		Assingment_30_1 assingment_30_1 = new Assingment_30_1();
		assingment_30_1.reverseNum();
	}

}
/*Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/
