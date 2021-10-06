package shantanu.arrayListPrograms_assignment46;

import java.util.ArrayList;

/*Find missing number in a range [1-10] from given ArrayList.*/
public class MissingNumber {
	ArrayList<Integer> findMissingNumbers(ArrayList<Integer> listOfNumbers){
		ArrayList<Integer> missingNumbers = new ArrayList<>();
		for(int num = 1; num <= 10; num++) {
			if(!listOfNumbers.contains(num))
				missingNumbers.add(num);
		}
		return missingNumbers;
	}
	public static void main(String[] args) {
		//1,6,2,5,7,6,3,10
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		listOfNumbers.add(1);
		listOfNumbers.add(6);
		listOfNumbers.add(2);
		listOfNumbers.add(5);
		listOfNumbers.add(7);
		listOfNumbers.add(6);
		listOfNumbers.add(3);
		listOfNumbers.add(10);
		
		MissingNumber missingNumber = new MissingNumber();
		System.out.println("Missing numbers:");
		System.out.println(missingNumber.findMissingNumbers(listOfNumbers));
	}
}
