package madhavi;
import java.util.*;
// Write a program to return Union of two ArrayList without duplicates.
public class Assignment_46_9 {
	
	public static void main(String[] args) {
		ArrayList<Integer> arraList1 = new ArrayList<Integer>(Arrays.asList(10, 19, 33, 44, 12));
		ArrayList<Integer> arraList2 = new ArrayList<Integer>(Arrays.asList(19, 99, 110, 11,10));
		
		// Using ArrayList...
		
		arraList2.removeAll(arraList1);
		arraList1.addAll(arraList2);
		
		System.out.println("Union of 2 Array Lists Without using third ArrayList"+arraList1);
		
		// Using Set...
		Set<Integer> setsample=new HashSet<Integer>();
		setsample.addAll(arraList1);
		setsample.addAll(arraList2);
		
		System.out.println(setsample);
		
		
		
	}

}
