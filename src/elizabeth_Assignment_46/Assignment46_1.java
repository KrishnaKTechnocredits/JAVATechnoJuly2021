/*Example 1 : 
Write a program to find given number is present in the arrayList or not*/

package elizabeth_Assignment_46;
import java.util.ArrayList;
class Assignment46_1{
	
	Boolean findGivenNumberIsPresent(ArrayList<Integer> arrayList, int num){
		if(arrayList.contains(num))
			return true;
		return false;
	}
	
	public static void main(String[] args){
		Assignment46_1 assignment46_1=new Assignment46_1();
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		arrayList.add(23);
		arrayList.add(45);
		arrayList.add(67);
		arrayList.add(89);
		arrayList.add(67);
		arrayList.add(34);
		arrayList.add(90);
		arrayList.add(12);
		arrayList.add(69);
		arrayList.add(56);
		System.out.println("------------Example 1-----------");
		System.out.println(assignment46_1.findGivenNumberIsPresent(arrayList,55));
		System.out.println(assignment46_1.findGivenNumberIsPresent(arrayList,56));
	}
}