package madhavi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/*find duplicate from array.
Option 1 : without Collection -> Array & loop inside loop
Option 2 : ArrayList : boolean contains()
Option 3 : Set : boolean add()
Option 4 : Map : value gr8 than 1.*/
public class Assignment_48_11 {
	int[] opArray;

	public void findDuplicatesWithoutCollections(Integer inputArrray[]) {

		System.out.println("Duplicate numbers in Array Using Array: ");
		for (int i = 0; i < inputArrray.length; i++) {
			for (int j = i + 1; j < inputArrray.length; j++) {
				if (inputArrray[i] == inputArrray[j]) {
					System.out.println(inputArrray[j]);

				}

			}

		}

	}

	public void findDuplicatesUsingArrayList(Integer inputArrray[]) {
		ArrayList<Integer> intlist = new ArrayList<>();
		System.out.println("Duplicate numbers in Array Using ArrayList: ");
		for (int index = 0; index < inputArrray.length; index++) {
			int number = inputArrray[index];
			if (intlist.contains(number)) {
				System.out.println(number);
			} else {
				intlist.add(number);
			}
		}
	}

	public void findDuplicatesUsingSet(Integer inputArrray[]) {
		System.out.println("Duplicate numbers in Array Using Set: ");
		Set<Integer> intSet = new LinkedHashSet<>();
		for (int number : inputArrray) {
			if (!intSet.add(number))

				System.out.println(number);
		}

	}

	public void findDuplicatesUsingMap(Integer inputArrray[]) {
		System.out.println("Duplicate numbers in Array Using Map: ");
		Map<Integer, Integer> intMap = new HashMap<Integer, Integer>();
		for (int index = 0; index < inputArrray.length; index++) {
			int key = inputArrray[index];
			if (intMap.containsKey(key)) {
				System.out.println(key);
			} else
				intMap.put(key, 1);

		}

	}

	public static void main(String[] args) {
		Assignment_48_11 assignment_48_11 = new Assignment_48_11();
		Integer inputArrray[] = { 1, 3, 4, 5, 7, 1, 3, 5, 4 };
		System.out.println("Input Array" + Arrays.toString(inputArrray));
		System.out.println("********************************");
		assignment_48_11.findDuplicatesWithoutCollections(inputArrray);
		System.out.println("********************************");
		assignment_48_11.findDuplicatesUsingArrayList(inputArrray);
		System.out.println("********************************");
		assignment_48_11.findDuplicatesUsingSet(inputArrray);
		System.out.println("********************************");
		assignment_48_11.findDuplicatesUsingMap(inputArrray);

	}

}
