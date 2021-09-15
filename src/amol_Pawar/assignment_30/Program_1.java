package amol_Pawar.assignment_30;

public class Program_1 {

	void getReverseNum(int input)
	{
		int revNum=0;
		int temp=input;
		while(input!=0)
		{
			int lastDigit = input % 10;
			revNum = revNum * 10 + lastDigit;
			input = input / 10;
		}
		System.out.println("Reverse number of "+temp +" is :"+revNum);
	}
	public static void main(String[] args) {
		Program_1 program_1=new Program_1();
		int num=1932;
		program_1.getReverseNum(num);

	}

}
/*Program 1: Write a method to reverse a given number.
input : 1932
output : 2391*/
