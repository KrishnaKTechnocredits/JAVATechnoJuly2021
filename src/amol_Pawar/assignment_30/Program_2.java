package amol_Pawar.assignment_30;

public class Program_2 {

	void checkArmstrongNum(int input)
	{
		int check=input;
		int temp=0;
		while(input!=0)
		{
			int lastDigit=input%10;
			temp=(int) (temp+Math.pow(lastDigit, 3));
			input=input/10;
		}
		if(temp==check)
		System.out.println("Given number " +check+" is Armstrong number");
		else
			System.out.println("Given number "+check+" is not Armstrong number");
	}
	public static void main(String[] args) {
		Program_2 program_2=new Program_2();
		int num=153;
		program_2.checkArmstrongNum(num);

	}

}
/*Program 2: Verify whether given number is Armstrong number.
input : 153
output : 153 is an Armstrong number*/
