/*Test 5 :
Find first 5 perfect numbers.*/
package shalaka.codingexam1;

public class Shalaka_Coding_Test5 {
void firstFivePerfectNos(int num){
		int count=0;
		int sum=1;
			for(int index=2;index<=num/2;index++) {
				if (count>=5)
					break;
				if(num%index==0) {
					sum+=index;
				}
			}
			if(sum==num) {
				count++;
				System.out.println(num+"is a perfect number");
			}
	}
	void printPerfectNumber() {
		System.out.println("First five perfect numbers are: ");
		for (int num = 2; num <= Integer.MAX_VALUE; num++) {
			firstFivePerfectNos(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shalaka_Coding_Test5 shalaka_Coding_Test5 = new Shalaka_Coding_Test5();
		shalaka_Coding_Test5.printPerfectNumber();
	}

}
