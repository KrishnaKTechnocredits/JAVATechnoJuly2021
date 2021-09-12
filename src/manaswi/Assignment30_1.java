package manaswi;
public class Assignment30_1
 {

	int reverseNumber(int num)
	{
		int rnum = 0;
		while (num > 0) 
		{
			rnum = rnum * 10 + (num % 10);
			num = num / 10;
		}
		return rnum;
	}

	public static void main(String[] args) 
	{
		Assignment30_1 assignment30_1 = new Assignment30_1();
		int num = 1932;
		System.out.println(assignment30_1.reverseNumber(num));
	}
}