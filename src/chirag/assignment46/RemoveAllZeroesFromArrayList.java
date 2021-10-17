package chirag.assignment46;

/*Remove all zeros from given ArrayList.
input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAllZeroesFromArrayList {
	ArrayList<Integer> removeAllZeroesFromArrayList(ArrayList<Integer> num) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int index=0;index < num.size();index++) {
			if(num.get(index) != 0) {
				al.add(num.get(index));
			}
		}
		return al;
	}
	public static void main(String[] args) {
		RemoveAllZeroesFromArrayList removeAllZeroesFromArrayList=new RemoveAllZeroesFromArrayList();
		Integer [] input= {0,1,3,0,6,0,7,5,4,6,0,3,0};
		List<Integer> list= Arrays.asList(input);
		ArrayList<Integer> al=new ArrayList<>(list);
		System.out.println(removeAllZeroesFromArrayList.removeAllZeroesFromArrayList(al));
	}
}