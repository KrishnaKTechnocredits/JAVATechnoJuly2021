package tanmoy_Roy;

public class Assignment13_3 {
	
	void printFiveSmallerNumbers(int N) {
		System.out.println("Five smaller number than "+N+" are : ");
		for(int i=N-1;i>=N-5;i--)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		Assignment13_3 assignment13_3=new Assignment13_3();
		assignment13_3.printFiveSmallerNumbers(50);

	}
}
