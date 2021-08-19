// write a method which returns 5 smaller numbers of the given number.
// I/P : 50
// O/P : 49, 48, 47, 46, 45

package sneha;

public class Assignment_13_3 {
 
	void printSmallerNumbers(int no) {
		 no = no-1;
		for(int index = 0; index < 5; index++) {
			System.out.println(no);
			no--;
		}
	}
	
	public static void main(String[] a) {
		Assignment_13_3 assignment_13_3 = new Assignment_13_3();
		assignment_13_3.printSmallerNumbers(50);
		
	}
}
