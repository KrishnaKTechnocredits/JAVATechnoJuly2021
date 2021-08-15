package nishi;

public class Assignment14C {
	
	int printDifferenceOfMinAndMax(int[] a)
	{
		Assignment14B assignment14b = new Assignment14B();
		Assignment14A assignment14a = new Assignment14A();
		int min = assignment14b.findMinNumber(a);
		int max = assignment14a.findMaxNumber(a);		
		return max-min;
	}

	public static void main(String[] args) {
		Assignment14C assignment14c = new Assignment14C();
		int[] a= {1,11,44,23,55,99,23};
		System.out.println("Difference of max & min : "+assignment14c.printDifferenceOfMinAndMax(a));

	}

}
