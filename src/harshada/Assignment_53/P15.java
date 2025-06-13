/* 15. WAP to print below pattern
1A2B3C
4D5E6F
7G8H9I */
package harshada.Assignment_53;

public class P15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cnt = 1;
		char ch = 65;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 6; j++) {
				if (j % 2 == 0) {
					System.out.print(ch);
					ch++;
				} else {
					System.out.print(cnt);
					cnt++;
				}
			}
			System.out.println();
		}
	}

}
