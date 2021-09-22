/*
 Test 5 :
Find first 5 perfect numbers.
 */ 
package atul_K.Assignments.ProgramTest5;

public class ProgramTest5 {

	void findPerfectNum() {
		int cnt=0;
		int num =2;
		while(cnt < 4) {
			int sum=1;
			for(int index=2;index <= num/2;index++) {
				if(num%index ==0)
					sum +=index;
			}
			if (sum == num) {
			System.out.print(num+" ");
			cnt++;
			}
			num++;
		}
	}
	public static void main(String[] args) {
		ProgramTest5 p5 = new ProgramTest5();
		p5.findPerfectNum();
	}
}
