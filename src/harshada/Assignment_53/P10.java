/* 10. WAP to print below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 */



package harshada.Assignment_53;

public class P10 {
	
	void print() {
		int count=1;
			
			for(int i=1; i <=5; i++ ) {
				
				for(int j=01; j<=i; j++) {
					System.out.print(count+ " ");
					count++;
				}
				
				System.out.println();	
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new P10().print();
	}

}
