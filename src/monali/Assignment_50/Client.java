package monali.Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Builder b1=new Builder("Clover",20044,8,12000);
		Builder b2=new Builder("Kumar",20099,6,5000);
		Builder b3=new Builder("Bhakti",11900,10,9000);
		Builder b4=new Builder("Rohan",40044,12,15000);
		Builder b5=new Builder("Clover",20044,8,12000);

		ArrayList<Builder> list=new ArrayList<>();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		Collections.sort(list);
		System.out.println(list);
	}
}
