/*Assignment - 31 : 9th Sep'2021
Program 1: verify given number is a perfect number or not.
input : 6
output : 6 is a perfect number

input : 50
output : 50 is not a perfect number

Program 2 : verify given number is a perfect square.
input : 25 
output : 25 is perfect square.

input : 20
output : 20 is not a perfect square.


Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66

Program 4:
In a user given range find all perfect numbers.
input : start range -> 40 , end range -> 170
output : ------ */
package chandani.Assignment_31;

public class Assignment31a {
	
	int sum = 0;
	
	int getPerfectNumber(int num) {
		for(int index = 1; index <= num/2; index++) {
			if(num % index == 0) {
			sum = sum + index;
			}
		}
	return sum;
	}

	void displayPerfectNumberOrNot(int num){
		if(num == getPerfectNumber(num)) {
			System.out.println("Given number " + num + " is a perfect number " );
		}else
			System.out.println("Given number " + num + " is not a perfect number " );		
	}
	
	public static void main (String[] args){
		Assignment31a assignment31a = new Assignment31a();
		assignment31a.displayPerfectNumberOrNot(6);
		Assignment31a assignment31a1 = new Assignment31a();
		assignment31a1.displayPerfectNumberOrNot(50);
		Assignment31a assignment31a2 = new Assignment31a();
		assignment31a2.displayPerfectNumberOrNot(496);	
	} 
	
}
