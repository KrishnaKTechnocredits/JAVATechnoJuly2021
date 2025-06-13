package shreya_assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Builder b1=new Builder("Priti",20044,8,15000);
		Builder b2=new Builder("Advik",20099,6,7000);
		Builder b3=new Builder("Kanak",11900,10,8000);
		Builder b4=new Builder("Priyal",40044,12,15000);
		Builder b5=new Builder("Rashmi",20044,8,23000);

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
