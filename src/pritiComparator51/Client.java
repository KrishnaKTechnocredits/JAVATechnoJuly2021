package pritiComparator51;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	Builder b1= new Builder("B123","BhosleBulder", 19000, 75);
	Builder b2= new Builder("M223","MahajanBulder", 13000, 45);
	Builder b3= new Builder("A323","AdityaBulder", 18000, 25);
	Builder b4= new Builder("K423","KirtiBulder", 15000, 30);
	Builder b5= new Builder("P523","PuranikBuilder", 16000, 10);
	
	void sortBuilder() {
		ArrayList<Builder> list= new ArrayList<> ();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		System.out.println("Sort Builder List based on Revenue:");
		Collections.sort(list,new RevenueComparator());
		System.out.println(list);
		System.out.println("Sort Builder List based on Total Completed Project:");
		Collections.sort(list,new TotalCompletedProjectComparator());
		System.out.println(list);
		
	}
	

	
	public static void main(String[] a) {
		Client c1= new Client();
		c1.sortBuilder();
	}
	
	
}
