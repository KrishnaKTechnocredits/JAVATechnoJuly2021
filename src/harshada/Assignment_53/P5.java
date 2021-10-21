/* 
 
 
 5. WAP to print below pattern
* * * * *
* * * *
* * *
* *
*


 */

package harshada.Assignment_53;

public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5 ; i >=1; i--) {
			
			for(int j=1; j<=i; j++) { //i=5
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	}

}
