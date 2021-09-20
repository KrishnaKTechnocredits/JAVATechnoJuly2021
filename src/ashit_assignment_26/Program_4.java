package ashit_assignment_26;

public class Program_4 {
	void swapNumberWithoutVariable (int a, int b) {
			System.out.println ("Vaule of variable before swap is " + a + " , " + b);
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println ("Vaule of variable post swap is " + a + " , " + b);


		}

		public static void main(String[] args) {
			new Program_4().swapNumberWithoutVariable(35, 20);
		}

	}

