/*Example 9 : 
Write a program to return Union of two ArrayList without duplicates.

input 1: [10, 19, 33, 44, 12]
input 2 : [19, 99, 110, 11,10]

output : [10,19,33,44,12,99,110,11]*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;


class Assignment46_9{
	
	ArrayList<Integer> getUnion(Integer[] input1,Integer[] input2){
		ArrayList<Integer> al1= new ArrayList<Integer>(Arrays.asList(input1));
		ArrayList<Integer> al2= new ArrayList<Integer>(Arrays.asList(input2));
		al2.removeAll(al1);
		al1.addAll(al2);
		return al1;
	}
	
	public static void main(String[] args){
		Assignment46_9 assignment46_9=new Assignment46_9();
		Integer[] input1={10, 19, 33, 44, 12};
		Integer[] input2={19, 99, 110, 11,10};
		System.out.println("------------Example 9-----------");
		System.out.println(assignment46_9.getUnion(input1,input2));
	}
}