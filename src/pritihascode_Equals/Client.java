package pritihascode_Equals;


import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;

public class Client {
	public static void main(String[] a) {
	Builder b1= new Builder("BB357866er","BhosleBulder", 10000, 10);
	Builder b2= new Builder("MN2B3612nr","MahajanBulder", 11000, 15);
	Builder b3= new Builder("AB13F236ar","AdityaBulder", 12000, 25);
	Builder b5= new Builder("PB52F312kr","PuranikBuilder", 16000, 75);
	Builder b6= new Builder("PB52F312kr","PuranikBuilder", 16000, 75);
	
	HashSet<Builder> setlist= new HashSet<Builder>();
	setlist.add(b1);
	setlist.add(b2);
	setlist.add(b3);
	setlist.add(b5);
	setlist.add(b6);
	/*System.out.println(b1.hashCode());
	System.out.println(b2.hashCode());
	System.out.println(b3.hashCode());
	System.out.println(b5.hashCode());
	System.out.println(b6.hashCode());*/
	System.out.println("Total objects = 5");
	System.out.println("2 object having exactly same attributes so they are duplicate objects: ");
	System.out.println("Output after adding only unique objects in to the Hashset:");
	System.out.println("Size of the Hashset : "+setlist.size());
	System.out.println(setlist);
	
	
	
	
	
	}
	
	
}

