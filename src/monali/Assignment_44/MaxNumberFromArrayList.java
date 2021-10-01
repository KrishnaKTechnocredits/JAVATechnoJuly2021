package monali.Assignment_44;
/*Assignment - 44 : 1st  Oct'2021 
Find out the max number from an ArrayList.
input: [10,7,99,53,74]
output: 99*/
import java.util.ArrayList;

public class MaxNumberFromArrayList {

	private static void getMaxNumFromArrayList(ArrayList<Integer> al) {
		int max = al.get(0);
		// normal for loop
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) > max)
				max = al.get(index);
		}
		System.out.println("Max number ---normal for loop " + max);

		
		// enhance for loop
		for (int element : al) {
			if (element > max)
				max = element;
		}
		System.out.println("Enhance for loop ---max value : " + max);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(7);
		al.add(54);
		al.add(89);
		al.add(44);
		MaxNumberFromArrayList.getMaxNumFromArrayList(al);
	}
}
