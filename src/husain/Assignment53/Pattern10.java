package husain.Assignment53;

public class Pattern10 {
	static int k = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Pattern 10\n");
		for(int i =1; i<=5;i++) {
			for(int j= 1; j<=i;j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}
	}

}
