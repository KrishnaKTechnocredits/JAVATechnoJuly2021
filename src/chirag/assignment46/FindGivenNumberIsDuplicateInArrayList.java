package chirag.assignment46;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to find given number is duplicate in arrayList

public class FindGivenNumberIsDuplicateInArrayList {
	
	void getDuplicateNumberIsGivenOrNot(ArrayList<Integer> num,int duplicateNum) {
		for(int index =0 ; index < num.size();index++) {
			
		if(num.indexOf(num.get(index)) != num.lastIndexOf(num.get(index))) {
			if(num.get(index) == duplicateNum) {
				System.out.println(num.get(index)+" is a duplicate number");
				break;
			}
		}
	}
}
	public static void main(String[] args) {
		FindGivenNumberIsDuplicateInArrayList findGivenNumberIsDuplicateInArrayList = new FindGivenNumberIsDuplicateInArrayList();
		Integer [] input= {2,3,4,3,5,6,4,78,0,54,3};
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(input));
		findGivenNumberIsDuplicateInArrayList.getDuplicateNumberIsGivenOrNot(al,4);
	}
}
