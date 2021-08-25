//Assignment - 11  [While loop] : DATE: 08/13/2021

package deepak.assignment_11;

public class WhileLoop {
	int sum;
	int indexcount;
	int primeNumCnt;
	
	void getPrimeNums(int number) {
		boolean flag = true;
		int index = 2;
		while(index < number) {
			if(number % index == 0) {
				flag = false;
				//System.out.println(number+" is not a prime number.");
				break;
			}
			index++;
		}if(flag) {
			System.out.println(number+" is a prime number.");
			primeNumCnt++;
		}	
	}
	
	void getPrimeNumbersForRange(int range) {
		int index = 1;
		while(primeNumCnt<range) {
			getPrimeNums(index);
			index++;
		}
	}
	
	void sumMoreThan100() {
		int index = 1;
		while(sum < 100) {
			sum = sum + index;
			index++;
			indexcount++;
		}System.out.println("Numbers required to make a sum more than 100 is: "+indexcount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileLoop obj = new WhileLoop();
		obj.sumMoreThan100();
		WhileLoop obj1 = new WhileLoop();
		obj1.getPrimeNumbersForRange(10);
	}

}
