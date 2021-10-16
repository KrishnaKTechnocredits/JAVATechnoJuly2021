package madhavi;

public class Assignment_53 {
	public static void pattern1(int n) {

		for (int i = 0; i < n; i++) {// use first for loop to print rows always..

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern2(int n) {

		// Outer loop work for rows
		for (int i = 0; i < n; i++) {
			// inner loop work for space
			for (int j = n - i; j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

	public static void pattern3(int n) {
		// i for rows and j for columns
		// row denotes the number of rows you want to print
		int i, j;
		// Outer loop work for rows
		for (i = 0; i < n; i++) {
			// inner loop work for space
			for (j = 2 * (n - i); j > 1; j--) {
				// prints space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (j = 0; j <= i; j++) {
				// prints star
				System.out.print("* ");
			}
			// throws the cursor in a new line after printing each line
			System.out.println();
		}
	}

	public static void pattern4(int n) {

		for (int i = 0; i < n; i++) {// use first for loop to print rows always..
			for (int k = n - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) + 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}

		int p = n - 1;
		for (int i = p - 1; i >= 0; i--) {// use first for loop to print rows always..
			for (int k = p + 1; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= ((2 * i) + 1); j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	public static void pattern5(int n) {

		for (int i = n; i >= 1; --i) {

			for (int j = 1; j <= i; ++j) {

				System.out.print("* ");

			}

			System.out.println();

		}
	}

	public static void pattern6(int n) {

		for (int i = 0; i <= n - 1; i++) { // For loop for Rows

			for (int j = 0; j <= i; j++) { // For loop for Col

				System.out.print(" "); // blank space

			}

			for (int k = 0; k <= n - 1 - i; k++) {

				System.out.print("*" + " "); // prints * and blank space

			}

			System.out.println(); // For Next line

		}
	}

	public static void pattern7(int n) {

		for (int i = 0; i < n; i++) { // For loop for Rows

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println(); // For Next line

		}
		for (int i = n - 1; i >= 0; i--) { // For loop for Rows

			for (int k = 0; k <= i - 1; k++) {

				System.out.print("* "); // prints * and blank space

			}

			System.out.println(); // For Next line

		}
	}

	public static void pattern8(int n) {

		int p = n - 1;
		for (int i = 0; i < n; i++) { // For loop for Rows

			for (int j = p; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("* ");
			}

			System.out.println(); // For Next line

		}

		for (int i = p; i > 0; i--) { // For loop for Rows
			// System.out.print(" ");
			for (int j = p + 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("* ");
			}

			System.out.println(); // For Next line

		}

	}

	public static void pattern9(int n) {

		for (int i = 1; i < n; i++) {// use first for loop to print rows always..

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern10(int n) {

		for (int i = 1; i < n; i++) {// use first for loop to print rows always..

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern11(int n) {

		for (int i = n; i >= 1; i--) {// use first for loop to print rows always..

			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern12(int n) {

		for (int i = 1; i <= n; i++) {// use first for loop to print rows always..

			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern13(int n) {

		for (int i = 1; i <= n; i++) {
			int num;
			if (i % 2 == 0) {
				num = 0;
				for (int j = 1; j <= n; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
			} else {
				num = 1;
				for (int j = 1; j <= n; j++) {
					System.out.print(num);
					num = (num == 0) ? 1 : 0;
				}
			}
			System.out.println();
		}
	}

	public static void pattern14(int n) {
		int alphabet = 65;
		for (int i = 0; i < n; i++) {// use first for loop to print rows always..

			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern15(int n) {
		int alphabet = 64;
		int count = 1; // for increasing numbers 1,2,3...
		for (int i = 0; i < n; i++) {// use first for loop to print rows always..

			for (int j = 0; j < n; j++) {// for Columns...
				System.out.print(count);
				System.out.print((char) (alphabet + count));
				count++;
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void pattern16(int n) {
		int upperCase = 65; // ASCII Start for Upper Case...
		int lowercase = 97; // ASCII Start for Lower Case...
		for (int i = 0; i < n; i++) {// use first for loop to print rows always..

			for (int j = 0; j <= i; j++) {
				if (i % 2 == 0) {
					System.out.print((char) (upperCase + j));
				} else {
					System.out.print((char) (lowercase + j));
				}
			}
			System.out.println(); // to go to next line ...
		}
	}

	public static void main(String[] args) {
		System.out.println("----------- Pattern Printing Designs:---------------");
		pattern1(4);
		System.out.println("-------------------------");
		pattern2(5);
		System.out.println("-------------------------");
		pattern3(5);
		System.out.println("-------------------------");
		pattern4(5);
		System.out.println("-------------------------");
		pattern5(5);
		System.out.println("-------------------------");
		pattern6(5);
		System.out.println("-------------------------");
		pattern7(5);
		System.out.println("-------------------------");
		pattern8(5);
		System.out.println("-------------------------");
		pattern9(6);
		System.out.println("-------------------------");
		pattern10(6);
		System.out.println("-------------------------");
		pattern11(5);
		System.out.println("-------------------------");
		pattern12(5);
		System.out.println("-------------------------");
		pattern13(5);
		System.out.println("-------------------------");
		pattern14(6);
		System.out.println("-------------------------");
		pattern15(3);
		System.out.println("-------------------------");
		pattern16(4);

	}

}
