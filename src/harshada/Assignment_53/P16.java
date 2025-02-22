/*
 * 16. WAP to print below pattern
A
ab
ABC
abcd */

package harshada.Assignment_53;

public class P16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 65; char ch1='a';
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				if(i%2==0) {
					System.out.print(ch1);
					ch1++;
				}else
					System.out.print(ch);
				ch++;
			}
			System.out.println();
			ch = 'A';
			ch1 = 'a';
		}
	}

}
