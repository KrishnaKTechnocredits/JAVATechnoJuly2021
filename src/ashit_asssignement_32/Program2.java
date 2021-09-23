package ashit_asssignement_32;

public class Program2 {

	void getPerfectNumber(int startIndex, int endIndex) {
			int divisors = 0;
			boolean flag = false;
			for(int index = startIndex; index < endIndex; index++) {
				if(getPerfectNumber(index)) {
					System.out.println(index);
					flag = true;
				}
			}
			if(!flag) {
				System.out.println("Perfect numbers are not present in the given range.");
			}
		}
		boolean getPerfectNumber(int num){
			int divisors = 0;
			for(int i =1; i<=num/2; i++) {
				if(num % i == 0) {
					divisors =  divisors + i;
				}
			}
			if(num == divisors)
				return true;
			else
				return false;
		}
		public static void main(String[] args) {
			Program2 pgm = new Program2();
			pgm.getPerfectNumber(40,170);
		}
}
