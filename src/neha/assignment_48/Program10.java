package neha.assignment_48;

import java.util.ArrayList;

/*program 10 : append 0 after 3 consecutive number.
input : [1,2,3,5,4,7];
ouput : [1,2,3,0,5,4,7];
Hint : ArrayList*/
public class Program10 {
	void appendZeroAfterConsequetiveNos(int[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int num : arr) {
			al.add(num);
		}
		for (int i = 0; i < al.size() - 2; i++) {
			if (al.get(i) + 1 == al.get(i + 1) && al.get(i) + 2 == al.get(i + 2))
				al.add(i + 3, 0);
		}
		System.out.println(al);
	}

	public static void main(String[] args) {
		Program10 program10 = new Program10();
		int[] input = { 1, 2, 3, 5, 4, 7 };
		program10.appendZeroAfterConsequetiveNos(input);
	}
}
