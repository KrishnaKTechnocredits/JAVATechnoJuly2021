package arti_K.Assignment_13;

public class PrintSmallerNum1 {
	int count;
	
	int printSmallerNum(int num) {
		int smallnum = 0;
		for(int index = 0; index <= num ; index++) {
			num = num - 1 ;
			smallnum = num;
			System.out.println(smallnum+" ");
			count++;
			if(count == 5)
				break;
		}
		return smallnum;
	}
	
	public static void main(String[] args) {
		PrintSmallerNum1 printsmallernum1 = new PrintSmallerNum1();
		printsmallernum1.printSmallerNum(50);
	}
}
