/*Assignment-41 : 28th Sep'2021  
Write a code to print below pattern.

*
##
***
####
******/
package purshottamJoshi;

public class Assignment41 {
	
	
	static void pattern(int row) {
		for(int index=1; index <= row; index++) {
			for(int innerindex=1; innerindex <=index; innerindex++) {
				if(index % 2 ==0) {
					System.out.print("#");
				}else {
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		pattern(5);
	}

}
