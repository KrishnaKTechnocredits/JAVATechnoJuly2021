/*
 Program 1: Write a method to reverse a given number.
input : 1932
output : 2391
 */
package atul_K.Assignments.Ass30;

public class Program1 {

	int revNum(int num) {
		 int revnum = 0;
		 int r = 0;
		 while(num >0){
			 r = num%10;
			 revnum = revnum * 10 + r;
			 num =num/10;
		 }
		 return revnum;
	}
	public static void main(String[] args) {
		int num = 8764;
		Program1 p1 = new Program1();
		System.out.println(p1.revNum(num));
	}
}
