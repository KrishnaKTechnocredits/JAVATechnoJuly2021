package shantanu.arrayListPrograms_assignment46;
/*Write a program to remove duplicate from ArrayList (without using set).*/
import java.util.ArrayList;

public class RemoveDuplicate {
	ArrayList<Integer> modifyList(ArrayList<Integer>listOfNumbers){
		for(int index = 0; index < listOfNumbers.size(); index++) {
			int num = listOfNumbers.get(index);
			if(listOfNumbers.indexOf(num) != listOfNumbers.lastIndexOf(num)) {
				listOfNumbers.remove(new Integer(num));
			}
		}
		return listOfNumbers;
	}
	public static void main(String[] args) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		listOfNumbers.add(1);
		listOfNumbers.add(2);
		listOfNumbers.add(3);
		listOfNumbers.add(3);
		listOfNumbers.add(2);
		listOfNumbers.add(4);
		
		RemoveDuplicate removeDuplicate = new RemoveDuplicate();
		System.out.println("Array list after removing duplicates:");
		System.out.println(removeDuplicate.modifyList(listOfNumbers));
		
	}
}
