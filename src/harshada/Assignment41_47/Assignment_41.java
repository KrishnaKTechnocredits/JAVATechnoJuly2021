//pattern printing

package harshada.Assignment41_47;

public class Assignment_41 {

	void printPattern() {
		int n=5;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(i%2==0) {
					System.out.print("#");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_41 assignment_41=new Assignment_41();
		assignment_41.printPattern();
		
	}

}
