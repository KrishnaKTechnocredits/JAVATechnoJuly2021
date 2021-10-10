/*Example 2 :
Write a program to find given number is duplicate in arrayList.*/

package elizabeth_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Assignment46_2{
	
	void findGivenNumberIsDuplicate(ArrayList<Integer> arrayList, int num){
		if(arrayList.indexOf(num)==arrayList.lastIndexOf(num)){
			System.out.println(num + " is not Duplicate");
		}else{
			System.out.println(num + " is Duplicate");
		}
	}
	
	public static void main(String[] args){
		Assignment46_2 assignment46_2=new Assignment46_2();
		List<Integer> list=Arrays.asList(2,4,6,7,8,9,4,6,3,10,45,34,56);
		ArrayList<Integer> arrayList=new ArrayList<Integer>(list);
		System.out.println("------------Example 2-----------");
		assignment46_2.findGivenNumberIsDuplicate(arrayList,6);
		assignment46_2.findGivenNumberIsDuplicate(arrayList,10);
		assignment46_2.findGivenNumberIsDuplicate(arrayList,20);
		assignment46_2.findGivenNumberIsDuplicate(arrayList,4);
	}
}