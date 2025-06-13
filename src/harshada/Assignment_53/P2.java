/* WAP to print below pattern

*
* *
* * *
* * * *
* * * * * 

*/


package harshada.Assignment_53;

public class P2 {

	void process() {
		

		for(int i=1; i<=5; i++) {
			
			for(int j=1; j<=5-i; j++) {
				//space
				System.out.print(" ");
			}
			
			for( int k=1; k<=i; k++) {
				
				System.out.print("*"+ " ");
			}
		
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2 p2=new P2();
		p2.process();
	}

}
