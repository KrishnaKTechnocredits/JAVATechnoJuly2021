/*10. WAP to print below pattern
        1 
      1 2 
    1 2 3 
  1 2 3 4 
1 2 3 4 5*/
package shalaka.Assignment53;

public class Pattern10 {
	static void pattern10(int row) {
		for(int i=1;i<=row;i++) {
			int cnt=1;
			for(int k=1;k<=row-i;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(cnt);
				cnt++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern10(5);
	}

}
