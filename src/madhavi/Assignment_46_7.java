package madhavi;

import java.util.ArrayList;

//Return ArrayList of first 10 prime numbers in the range [100,500].
public class Assignment_46_7 {
	public static void main(String[] args) {
		System.out.println("Print first 10 prime numbers in the range [100,500]");
		System.out.println("--------------------------------------------------");
		ArrayList<Integer> intlist = new ArrayList<>();
		int index = 1;
		int print = 100;
		boolean status;
		// 1st approach
		while (print <= 500 && index <= 10) {

			status = true;
			for (int range = 2; range <= print - 1; range++) {
				if (print % range == 0) {
					status = false;
					break;
				}
			}
			if (status) {
				// System.out.println(print);
				intlist.add(print);
				index++;
			}
			print++;

		}
		System.out.println(intlist);

		// 2nd approach
		while (index <= 10) {
		for (int i = 100; i <= 500; i++) {
			status = true;
			for (int range = 2; range <= i - 1; range++) {
				if (i % range == 0) {
					status = false;
					break;
				}

			}
			if (status) {
				//System.out.println(i);
				intlist.add(print);
				index++;
			}

			
		}
		}
		
		System.out.println(intlist);
	}

}
