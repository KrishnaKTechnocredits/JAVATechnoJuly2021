package harshada;
import java.util.Scanner;

public class Assignment_19_Program_4 {
	
		int getSumOfNumbers() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter numbers : ");
			String str = scan.nextLine();
			String output[] = str.split(" ");
			int sum = 0;
			for (int index = 0; index < output.length; index++) {
				sum =sum+  Integer.parseInt(output[index]);
			}
			scan.close();
			return sum;

		}

		public static void main(String[] args) {
			Assignment_19_Program_4 assignment_19_P4 = new Assignment_19_Program_4();
			System.out.println("Output : " + assignment_19_P4.getSumOfNumbers());
		}

}
