//Print first N prime numbers.
//N should be passed as parameter in the method.
//Hint : 10 pass as parameter, method should print first 10 prime numbers.

package sneha;

class Assignment_11_1{
	
	void printFirstNPrime(int num) {
		int count= 0, i = 0,j=2;
		while(i<=num) {
			for(int index = 1; index<=j; index++) {
				if(j%index == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(j);
				i++;
			}
			j++;
		}
	}
	
	public static void main(String[] a) {
		Assignment_11_1 assignment_11_1 = new Assignment_11_1();
		assignment_11_1.printFirstNPrime(5);
	}
}