package rushikesh.assign30;

public class Assign30_1 {
	int num1;
	int revNumber(int input) {
		int revNum=0;
		int num;
		num=input;
		while(num>0) {
			int rem=num%10;
			revNum=revNum*10+rem;
			num=num/10;
		}
		return revNum;
	}
	public static void main(String[] args) {
		Assign30_1 assign30_1=new Assign30_1();
		int reverseNum=assign30_1.revNumber(1932);
		System.out.println("The reverse of given num is "+reverseNum);
	}

}
