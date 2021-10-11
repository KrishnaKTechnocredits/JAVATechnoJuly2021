package monika.Assignment_51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client implements Comparator<Builders> {

public static void main (String[] args) {
	
	Builders b1=new Builders("A1", "DER4423", 20, 310);
	Builders b2 = new Builders("C1", "FWER323", 35, 200);
	Builders b3 = new Builders("B1", "RER4344", 10, 300);
	Builders b4 = new Builders("D1", "WEE3432", 35, 200);
	Builders b5 = new Builders("E1", "FER4242", 40, 100);
	
	List<Builders> list = new ArrayList<Builders>();
	list.add(b1);
	list.add(b2);
	list.add(b3);
	list.add(b4);
	list.add(b5);
	Collections.sort(list, new Builder1());
	System.out.println(list);

}

@Override
public int compare(Builders o1, Builders o2) {
	// TODO Auto-generated method stub
	return o1.totalCompletedProject - o2.totalCompletedProject;
}
}

