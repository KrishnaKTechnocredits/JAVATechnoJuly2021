package rushikesh.assign46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign46_14 {
	public static void main(String[] args) {

		String arr[] = {"techno", "credits", "java", "selenium", "automation"};
		List<String> list1 = new ArrayList<String>();
		System.out.println("\nInput array ::" + Arrays.toString(arr));
		list1.addAll(Arrays.asList(arr));
		System.out.println("\nPrinting list after moving array elements to List using 'addAll' :: \n" + list1);

		List<String> list2 = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("\nPrinting list after moving array elements to List by passing arr in 'ArrayList constructor' ::\n" + list2);

		List<String> list3 = Arrays.asList(arr);
		System.out.println("\nPrinting list after moving array elements to List by passing arr in 'Arrays.asList'  :: \n" + list3);



	}
	
	

}
