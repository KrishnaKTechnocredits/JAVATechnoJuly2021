/*13. WAP to print below pattern
10101
01010
10101
01010
10101*/
package shalaka.Assignment53;

public class Pattern13 {
	
	static void pattern13(int row) {
		int cnt=0;
		for(int i=0;i<=row;i++) {
			if(i%2==0)
				cnt=1;
			else
				cnt=0;
			for(int j=1;j<=row;j++) {
				System.out.print(cnt+" ");
				if(cnt==1)
					cnt=0;
				else
					cnt=1;
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern13(5);
	}

}
