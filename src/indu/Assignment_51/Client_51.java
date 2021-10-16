package indu.Assignment_51;

import java.util.ArrayList;
import java.util.Collections;

public class Client_51 {
	public static void main(String[] args) 
	{
		Builder_51 b1 = new Builder_51("Indu","ABZ12398IN",11,19000000); 
		Builder_51 b2 = new Builder_51("Kiya","AHR12398IN",19,9000000); 
		Builder_51 b3 = new Builder_51("Bhartiya","AHGG145IC",16,1000000); 
		Builder_51 b4 = new Builder_51("Techno","GFS654TGF",20,5000000); 
		Builder_51 b5 = new Builder_51("Credits","TDSH145AY",14,8000000); 

		ArrayList<Builder_51> alist = new ArrayList<>();
		alist.add(b1);
		alist.add(b2);
		alist.add(b3);
		alist.add(b4);
		alist.add(b5);

		Collections.sort(alist , new RevenueComparator_51());
		System.out.println(alist);
		Collections.sort(alist ,Collections.reverseOrder(new TotalCompleteProjectComparator()));
		System.out.println(alist);
	}
}
