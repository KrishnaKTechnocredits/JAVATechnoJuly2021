package precilla.assignment46;
import java.util.ArrayList;
/*Example 12 :
Remove all zeros from given ArrayList.
*/
import java.util.Arrays;
import java.util.Iterator;


public class Program12 {
	public static void main(String[] args) {
		Integer[] arr= {10,0,0,1,0,3,0,2,6};
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("input : "+al);
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			if(itr.next()==0)
				itr.remove();
		}
		System.out.println("output : "+al);
		
	}

}
