//Assignment 13 : 15th Aug'2021

//program 1 : return count of positive numbers from given array.
//int[] input = {1,-11,-44,23,55,-99,-23,-22};
//output : 3

//program 2 : count number of zero's in given array.
//int[] input = {1,-11,0,0,55,0,-23,0};

//output : 4


//program 3 : write a method which returns 5 smaller numbers of the given number.
//input : 50
//output : 49, 48, 47, 46, 45


package chaitanya.Assignment13;

public class Ass13_5smallernumbersofagivennumber{
	
	void display5SmallerNumbers(int basenumber, int num) { 
		
		int[] outputarr = new int[num];
		System.out.println(num + " Smaller Numbers than " + basenumber + " : ");
		for (int index = 0 ; index < num ; index++) {
			   outputarr[index] = --basenumber;
			    System.out.println(outputarr[index]);
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass13_5smallernumbersofagivennumber  ass13_5smallernumbersofagivennumber = new Ass13_5smallernumbersofagivennumber();
		ass13_5smallernumbersofagivennumber.display5SmallerNumbers(50,5);
	}

}

