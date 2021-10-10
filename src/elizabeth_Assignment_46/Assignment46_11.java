/*Example 11 :
Remove all zeros from given ArrayList.

input : [10,0,0,1,0,3,0,2,6]
output : [10,1,3,2,6]*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


class Assignment46_11{
	
	ArrayList<Integer> removeAllZeros(ArrayList<Integer> al){
		ArrayList<Integer> al1= new ArrayList<Integer>();
		for(int index=0;index<al.size();index++){
			if(al.get(index)==0){
				al1.add(al.get(index));
			}
			al.removeAll(al1);
		}
		return al;
	}
	
	public static void main(String[] args){
		Assignment46_11 assignment46_11=new Assignment46_11();
		List<Integer> list=Arrays.asList(10,0,0,1,0,3,0,2,6);
		ArrayList<Integer> arrayList=new ArrayList<Integer>(list);
		System.out.println("------------Example 11-----------");
		System.out.println(assignment46_11.removeAllZeros(arrayList));
	}
}