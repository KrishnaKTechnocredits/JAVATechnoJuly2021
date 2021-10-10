/*Example 16:
Write a program to add element at particular index of ArrayList?.*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;

class Assignment46_16{
	
	void addElement(String[] arr, int index){
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		al.add(index,"Bengaluru");
		System.out.println(al);	
	}
	public static void main(String[] args){
		String[] arr={"Pune","Mumbai","Chennai","Hyderabad"};
		Assignment46_16 assignment46_16=new Assignment46_16();
		System.out.println("------------Example 16-----------");
		assignment46_16.addElement(arr,2);
	}
}