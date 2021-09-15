package akshay;

public class Assignment30_2 {
	
	int getArmstrong(int num) {
		int rnum = 0;
		int sum = 0;
		int armstrongNum = 0;
		while(num > 0) {
			rnum = num % 10;
			armstrongNum = (rnum * rnum * rnum) + armstrongNum;
			sum = sum * 10 + rnum;
			num = num /10;
		}
		return armstrongNum;
	}
	
	void findArmstrong(int num) {
		if(getArmstrong(num) == num)
			System.out.println(num + " is a armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
	}
	
	public static void main(String[] args) {
		Assignment30_2 assignment30_2 = new Assignment30_2();
		int input = 153;
		assignment30_2.findArmstrong(input);
		int input1 = 4331;
		assignment30_2.findArmstrong(input1);
	}
}
