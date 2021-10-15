/*Example 10 :
Find missing number in a range [1-10] from given ArrayList.
input : [1,6,2,5,7,6,3,10]
output : [4,8,9]

Hint : Method Parameter should be ArrayList, return type should be ArrayList.*/
package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Assignment46_10{
	
	ArrayList<Integer> getMissingNumbers(ArrayList<Integer> al,Integer start,Integer end){
		ArrayList<Integer> al1= new ArrayList<Integer>();
		for(int index=start;index<=end;index++){
			if(!al.contains(index)){
				al1.add(index);
			}
		}
		return al1;
	}
	
	public static void main(String[] args){
		Assignment46_10 assignment46_10=new Assignment46_10();
		List<Integer> list=Arrays.asList(1,6,2,5,7,6,3,10);
		ArrayList<Integer> arrayList=new ArrayList<Integer>(list);
		System.out.println("------------Example 10-----------");
		System.out.println(assignment46_10.getMissingNumbers(arrayList,1,10));
	}
}