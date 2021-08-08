package akshay;

public class Assignment_7 {
	
	void evennumbers(int startindex, int endindex) {
		System.out.println("Even numbers are:");
		for(int index = startindex ; index<=endindex; index++) {
			if(index % 2 == 0)
				System.out.println(index);
		}
	}
	
	void divisiblebyfive(int startindex, int endindex) {
		System.out.println("\nDivisible by 5, Numbers are: ");
		for(int index = startindex ; index<=endindex; index++) {
			if(index % 5 == 0)
				System.out.println(index);
		}
	}
	
	void divisiblebyfiveandthree(int startindex, int endindex) {
		System.out.println("\nDivisible by 5 and 3, Numbers are: ");
		for(int index = startindex ; index<=endindex; index++) {
			if(index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}
	
	void divbysevenandtherteen(int startindex, int endindex) {
		System.out.println("\nDivisible by 7 and 13, Numbers are: ");
		for(int index = startindex ; index<=endindex; index++) {
			if(index % 7 == 0 || index % 13 == 0)
				System.out.println(index + " is divisible by " + index);
		}
	}
	
	void sumofnumbers(int startindex, int endindex) {
		int sum = startindex;
		for(int index = startindex ; index<=endindex; index++)
			sum = sum + index;
		System.out.println("\nSum is " + sum);
	}
	
	void differencesumofoddandeven(int startindex, int endindex) {
		int sumeven = startindex;
		int sumodd = startindex;
		int difference = 0;
		for(int index = startindex ; index<=endindex; index++) {
			if(index % 2 == 0)
				sumeven = sumeven + index;
			else
				sumodd = sumodd + index;
			
			difference = sumodd - sumeven;
		}
		System.out.println("\nDifference between sum of odd and even numbers: " + difference);
	}
	
	void reverseoddnumbers(int startindex, int endindex) {

		System.out.println("\nReverse odd numbers are:");
		for(int index = endindex ; index >= startindex; index--) {
			if(index % 2 != 0)
				System.out.println(index);
		}
	}
	
	public static void main(String[] args) {
		Assignment_7 assignment7 = new Assignment_7();
		assignment7.evennumbers(10, 15);
		assignment7.divisiblebyfive(10, 30);
		assignment7.divisiblebyfiveandthree(5, 18);
		assignment7.divbysevenandtherteen(5, 40);
		assignment7.sumofnumbers(1, 5);
		assignment7.differencesumofoddandeven(3, 9);
		assignment7.reverseoddnumbers(10, 20);	
	}
}
