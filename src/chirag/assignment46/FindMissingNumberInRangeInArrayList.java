package chirag.assignment46;

/*Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]
Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingNumberInRangeInArrayList {
	
	ArrayList<Integer> getMissingNumberInArrayList(ArrayList<Integer> num) {
		
		ArrayList<Integer> missingNumber=new ArrayList<>();
		for(int index=0;index <= 10;index++) {
			if(!num.contains(index)) {
				missingNumber.add(index);
			}
		}
		return missingNumber;
	}
	public static void main(String[] args) {
		FindMissingNumberInRangeInArrayList findMissingNumberInRangeInArrayList=new FindMissingNumberInRangeInArrayList();
		Integer [] input= {2,4,6,8,9,44,66,3,21,9,10};
		List<Integer> list=Arrays.asList(input);
		ArrayList<Integer> al=new ArrayList<>(list);
		System.out.println(findMissingNumberInRangeInArrayList.getMissingNumberInArrayList(al));
	}
}