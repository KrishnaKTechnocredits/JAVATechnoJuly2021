package himanshu_string_assignment;

public class SwappingTheNumbers {

	int temp;

	void swappingMtdWithThreeVariables(int x, int y) {
		
		System.out.println("Swapping Using 3rd Varible");

		System.out.println("Value of X before Swapping : " + x);
		System.out.println("Value of Y before Swapping : " + y);

		temp = x; // temp = 10
		x = y; // x = 20
		y = temp; // y = 10

		System.out.println("Value of X After Swapping : " + x);
		System.out.println("Value of Y After Swapping : " + y);
	}
	
	void swappingMtdWithTwoVariable(int x, int y) {

		System.out.println("**************************************************************");
		
		System.out.println("Swapping Without Using 3rd Varible");
		
		System.out.println("Value of X before Swapping : " + x);
		System.out.println("Value of Y before Swapping : " + y);

		y = y - x;
		x = x + y;

		System.out.println("Value of X After Swapping : " + x);
		System.out.println("Value of Y After Swapping : " + y);
	}
	public static void main(String[] args) {

		SwappingTheNumbers swapping = new SwappingTheNumbers();
		swapping.swappingMtdWithThreeVariables(10, 30);
		swapping.swappingMtdWithTwoVariable(500, 1000);

	}
}

