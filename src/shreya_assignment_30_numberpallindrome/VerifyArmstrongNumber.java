package shreya_assignment_30_numberpallindrome;

public class VerifyArmstrongNumber {
	void getresult() {
	int input=153,num,remainder,result=0;
	num=input;
	while (num > 0)
    {
        remainder = num % 10;
        result += Math.pow(remainder, 3);
        num /= 10;
    }

    if(result == input)
        System.out.println(input + " is an Armstrong number.");
    else
        System.out.println(input + " is not an Armstrong number.");
	}
	public static void main(String[] args) {
		VerifyArmstrongNumber verifyArmstrongNumber=new VerifyArmstrongNumber();
		verifyArmstrongNumber.getresult();
	}

}
