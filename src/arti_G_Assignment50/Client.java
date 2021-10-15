package arti_G_Assignment50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		ArrayList<Builder> list = new ArrayList<>();
		Builder b1 = new Builder("Arti", "4884338HJDSHFJSD", 5, 10000);
		Builder b2 = new Builder("Akansha", "4763748HJDSHFJSD", 3, 120000);
		Builder b3 = new Builder("Nidhi", "4674738HJDSHFJSD", 6, 150000);
		Builder b4 = new Builder("Varun", "4573773HJDSHFJSD", 8, 180000);
		Builder b5 = new Builder("Nishi", "4473444HJDSHFJSD", 15, 130000);

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);

		Collections.sort(list);
	//	Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
