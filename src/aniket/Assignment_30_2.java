package aniket;

//verify whether given number is armstrong number 
public class Assignment_30_2 {

	int getArmStrongNumber(int number) {
		int armStrongnumber = 0;
		int sum = 0;
		while (number != 0) {
			int lastindex = number % 10;
			armStrongnumber = (lastindex * lastindex * lastindex) + armStrongnumber;
			sum = sum * 10 + lastindex;
			number = number / 10;

		}
		return armStrongnumber;

	}
	 boolean isArmStrongNumber(int num) {
		 boolean flag = true;
		 if(getArmStrongNumber(num)==num)
			 flag=true;
		 else 
			 flag = false;
		 return flag;
	 }
	
	

	public static void main(String[] args) {
		 System.out.println("The given number is Armstrong number : " + new Assignment_30_2().isArmStrongNumber(153));
	}
}
