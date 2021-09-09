package chirag.assignment31;

public class NumberIsPerfectSqaureOrNot {
	
	void isPerfectSquare(int num) {
		double root = Math.sqrt(num);
		if((root*root) == num)
		System.out.println(num +" : is a perfect sqaure and its sqaure root is "+root);
		else 
			System.out.println(num +" : is not perfect sqaure and is sqaure root is "+root);
	}
	
	public static void main(String[] args) {
		NumberIsPerfectSqaureOrNot isPerfectSqaureOrNot = new NumberIsPerfectSqaureOrNot();
		isPerfectSqaureOrNot.isPerfectSquare(25);
		isPerfectSqaureOrNot.isPerfectSquare(-25);
		isPerfectSqaureOrNot.isPerfectSquare(0);
	}

}
