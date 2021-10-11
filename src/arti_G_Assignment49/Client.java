package arti_G_Assignment49;

import java.util.HashSet;

import arti_G_Assignment49.Builder;

public class Client {

	public static void main(String[] args) {


		Builder b1 = new Builder("Arti", "4884338HJDSHFJSD", 5, 10000);
		Builder b2 = new Builder("Akansha", "4763748HJDSHFJSD", 3, 120000);
		Builder b3 = new Builder("Nidhi", "4674738HJDSHFJSD", 6, 150000);
		Builder b4 = new Builder("Varun", "4573773HJDSHFJSD", 8, 180000);
		Builder b5 = new Builder("Arti", "4884338HJDSHFJSD", 5, 10000);

		HashSet<Builder> set = new HashSet<Builder>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		
		System.out.println(set.size());

}
}