/*Test 5 :
Find first 5 perfect numbers*/
package sagar_Anasane;

public class CodingTest5 {
	int findPerfectNumber(int num) {
		int sum=0;
		for(int index=1;index<num;index++) {
				if(num%index==0) {
					sum=sum+index;	
				}
		}
		if(sum==num) {
		System.out.println("Perfect Number :"+num);
		}
	return num;	
	}
	
	void findNPerfectNos(int num) {
		for(int index=1;;index++) {
			int count =1;
			if(count<=num) {
			findPerfectNumber(index);
			count++;
			}
		}
	}
	
	public static void main(String args[]) {
		CodingTest5 codingTest5 = new CodingTest5();
		codingTest5.findNPerfectNos(5);
	}
}
