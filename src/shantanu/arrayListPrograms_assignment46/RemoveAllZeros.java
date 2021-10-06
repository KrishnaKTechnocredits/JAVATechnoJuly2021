package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Remove all zeros from given ArrayList.*/
public class RemoveAllZeros {
	ArrayList<Integer> getNewList(ArrayList<Integer> listOfNumbers){
		ArrayList<Integer> withoutZeros = new ArrayList<>();
		for(int num : listOfNumbers) {
			if(num != 0)
				withoutZeros.add(num);
			}
		return withoutZeros;
	}
	public static void main(String[] args) {
		//10,0,0,1,0,3,0,2,6
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(10);
		listOfNumbers.add(0);
		listOfNumbers.add(0);
		listOfNumbers.add(1);
		listOfNumbers.add(0);
		listOfNumbers.add(3);
		listOfNumbers.add(0);
		listOfNumbers.add(2);
		listOfNumbers.add(6);
		
		RemoveAllZeros removeAllZeros = new RemoveAllZeros();
		System.out.println("List after removing zeros:");
		System.out.println(removeAllZeros.getNewList(listOfNumbers));
	}
}
