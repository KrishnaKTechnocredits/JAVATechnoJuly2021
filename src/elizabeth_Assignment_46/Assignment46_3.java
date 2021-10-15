/*Example 3 :
Write a program to remove duplicate from ArrayList (without using set).*/

package elizabeth_Assignment_46;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Assignment46_3{
	
	void removeDuplicates(ArrayList<Integer> arrayList){
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int index=0;index<arrayList.size();index++){
			if(arrayList.indexOf(arrayList.get(index))==index){
				al.add(arrayList.get(index));
			}
		}
		System.out.println(al);
		
	}
	
	public static void main(String[] args){
		Assignment46_3 assignment46_3=new Assignment46_3();
		List<Integer> list=Arrays.asList(2,4,6,8,10,2,4,7,8,9);
		ArrayList<Integer> arrayList=new ArrayList<Integer>(list);
		System.out.println("------------Example 3-----------");
		assignment46_3.removeDuplicates(arrayList);
	}
}