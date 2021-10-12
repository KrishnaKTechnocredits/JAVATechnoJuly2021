package indu.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client_50 {

	public static void main(String[] args) 
	{
		Builder_50 b1 = new Builder_50("Indu","ABZ12398IN",11,19000000); 
		Builder_50 b2 = new Builder_50("Kiya","AHR12398IN",19,9000000); 
		Builder_50 b3 = new Builder_50("Bhartiya","AHGG145IC",16,1000000); 
		Builder_50 b4 = new Builder_50("Techno","GFS654TGF",20,5000000); 
		Builder_50 b5 = new Builder_50("Credits","TDSH145AY",14,8000000); 

		ArrayList<Builder_50> alist = new ArrayList<>();
		alist.add(b1);
		alist.add(b2);
		alist.add(b3);
		alist.add(b4);
		alist.add(b5);
		
		Collections.sort(alist);
		System.out.println(alist);
	}
}
