package chirag.assignment46;

//Write a program to find given number is present in the arrayList or not

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindGivenNumberInArrayList {
	
	ArrayList<Integer> getGivenNumberInArrayList(ArrayList<Integer> num,int presentNumber) {
		
		for(int index=0;index < num.size();index++) {
			if(num.contains(presentNumber)) {
				System.out.println(presentNumber + " Number is present in a list");
				break;
			}
			else {
				System.out.println(presentNumber +" Number is not present in a list");
				break;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		FindGivenNumberInArrayList findGivenNumberInArrayList = new FindGivenNumberInArrayList();
		Integer [] input = {3,5,7,9,10,22,34,12,56};
		List<Integer> list=Arrays.asList(input);
		ArrayList<Integer> al=new ArrayList<>(list);
		findGivenNumberInArrayList.getGivenNumberInArrayList(al,9);
		findGivenNumberInArrayList.getGivenNumberInArrayList(al,11);
	}

}
