package shalaka.assignment11;

public class SumOfNumberMoreThanHundred {
	
	void printSumOfNumberMoreThanHundred() {
		int sum=0, num=1,count=0;
		while(sum<=100){
			sum=sum+num;
			num++;
			count++;
		}
		System.out.println("Required numbers to generate sum more than 100 is: "+count);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumberMoreThanHundred sumOfNumberMoreThanHundred = new SumOfNumberMoreThanHundred();
		sumOfNumberMoreThanHundred.printSumOfNumberMoreThanHundred();
	}

}
