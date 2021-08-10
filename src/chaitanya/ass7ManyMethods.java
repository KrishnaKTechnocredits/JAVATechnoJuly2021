//Assignment - 7 : 8th Aug2021

//Write only one program having following methods. [7 methods in same program] 

//1. On user define range print all even numbers. 
//Hint : pass start and end index as a parameter.
//Input : Range -> 10 to 15
//Output : Even numbers are:
//		 10
//		 12
//		 14	

//2. On user define range print all numbers which is divisible by 5. 
//Hint : pass start and end index as a parameter.
//Input : Range -> 10 to 30
//Output : Divisible by 5, numbers are:
//		 10
//		 15
//		 20
//		 25
//		 30	

//3. On user define range print all numbers which is divisible by 5 and divisible by 3. 
//Hint : pass start and end index as a parameter.
//Input : Range -> 5 to 18
//Output : Divisible by 5 & 3, numbers are:
//		 15

//4. On user define range print all numbers which is divisible by 7 or 13. 
//Hint : pass start and end index as a parameter.
//Input : Range -> 5 to 40
//Output : Divisible by 7 or 13, numbers are:
//		 7 is divisible by 7
//		 13 is divisible by 13
//		 14 is divisible by 7
//		 21 is divisible by 7
//		 26 is divisible by 13
//		 28 is divisible by 7
//		 35 is divisible by 7
//		 39 is divisible by 13

//5. Find sum of all the numbers in user define range.
//Input : Range -> 1 to 5
//output : sum is 15

//6. Find difference between sum of odd numbers and even numbers in a given range
//Input : Range -> 3 to 9
//output : 6
//hint : (3+5+7+9) - (4+6+8) = 6

//7. Print only odd numbers in reverse order.
//Input : Range -> 10 to 20
//output : 19
//        17
//         15
//         13
//         11


package chaitanya;

public class ass7ManyMethods {

	int index;

	void evenNumbers(int sindex, int eindex) {
		for (index=sindex ; index<=eindex ; index++) {
			if (index%2==0)
				System.out.println(index + " is a Even Number\n");
		}

	}

	void divisibleBy5(int sindex, int eindex) {
		for (index=sindex ; index<=eindex ; index++) {
			if (index%5==0)
				System.out.println(index + " is divisible by 5\n");
		}

	}

	void divisibleBy5and3(int sindex, int eindex) {

		for (index = sindex ; index <= eindex ; index++ ) {

				if (index%3==0 && index%5==0)
					 System.out.println(index + " Divisible by 3 & 5\n");
				else if (index%3==0)
					System.out.println(index + " Divisible by 3\n");
		       else if (index%5==0)
		    	   System.out.println(index + " Divisible by 5\n");

			}
	}

	void divisibleBy7and13(int sindex, int eindex) {

		for (index = sindex ; index <= eindex ; index++ ) {

				if (index%7==0 && index%13==0)
					 System.out.println(index + " Divisible by 7 & 13\n");
				else if (index%13==0)
					System.out.println(index + " Divisible by 13\n");
		       else if (index%7==0)
		    	   System.out.println(index + " Divisible by 7\n");

			}
	}

	void sum(int sindex, int eindex) {
		int sum = 0 ;
		for (index=sindex; index<=eindex ; index++) {
			sum += index;
		}
			System.out.println("Sum of the Integers between " + sindex + " & " + eindex + " = " + sum);

	}

	void diffEO(int sindex, int eindex) {
		int sum1= 0; int sum2 = 0 ; int sum3 = 0 ;
			for (index=sindex; index<=eindex ; index++ ) {
				if(index%2!=0)
					sum1 += index ;
				else
					sum2 += index;
			}
			sum3 = sum1-sum2;
			System.out.println("Difference b/w Sum of the Even & Odd Integers in a given range of " + sindex + " & " + eindex + " = " + sum3);	
	}

	void oddNumbersRev(int sindex,int eindex) {

		System.out.println("Odd Numbers b/w " + sindex + " & " + eindex + " in Reverse Order : \n");

		for (index=eindex; index>=sindex ; index--) {
			if (index%2!=0)
			 System.out.println(index + "\n");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ass7ManyMethods ass7manymethods = new ass7ManyMethods();
		ass7manymethods.evenNumbers(10,15);
		ass7manymethods.divisibleBy5(10,30);
		ass7manymethods.divisibleBy5and3(5,18);
		ass7manymethods.divisibleBy7and13(5,40);
		ass7manymethods.sum(1,5);
		ass7manymethods.diffEO(3,9);
		ass7manymethods.oddNumbersRev(10,20);
	}

}