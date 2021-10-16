package pritiComparable_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	Builder b1= new Builder("B123","BhosleBulder", 10000, 10);
	Builder b2= new Builder("A323","AdityaBulder", 12000, 25);
	Builder b3= new Builder("K423","KirtiBulder", 15000, 30);
	Builder b4= new Builder("P523","PuranikBuilder", 16000, 75);
	Builder b5= new Builder("P523","PuranikBuilder", 9000, 65);
	Builder b6= new Builder("M223","MahajanBulder", 11000, 15);
	
	void builderSortByRevenue() {
		ArrayList<Builder> list= new ArrayList<Builder>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		list.add(b6);
		System.out.println("Size of ArrayList: "+list.size());
		Collections.sort(list);
		System.out.println(list);
	}
	
	public static void main(String[] a) {
		Client c1= new Client();
		c1.builderSortByRevenue();
	}
	
	
	
	
	
}
