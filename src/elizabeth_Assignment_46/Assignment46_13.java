/*Example 13:
Write a program to traverse (or iterate) ArrayList using enhanced for loop and iterator*/

package elizabeth_Assignment_46;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class Assignment46_13{
	
	void traverseWithEnhancedLoop(ArrayList<String> al){
		for(String str:al){
			System.out.println(str);
		}
	}
	
	void traverseWithIterator(ArrayList<String> al){
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args){
		Assignment46_13 assignment46_13=new Assignment46_13();
		List<String> list=Arrays.asList("Eliza","Mary","Techno","Credits");
		ArrayList<String> arrayList=new ArrayList<String>(list);
		System.out.println("------------Example 13-----------");
		assignment46_13.traverseWithEnhancedLoop(arrayList);
		System.out.println("-----------------------");
		assignment46_13.traverseWithIterator(arrayList);
	}
}