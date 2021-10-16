package nishi.Assignment51;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	public static void main(String[] args) {
		Builder b1=new Builder("Nishi","GSTWBQ11",10,10000);
		Builder b2=new Builder("Rahul","GSTWBQ12",5,20000);
		Builder b3=new Builder("Saurav","GSTWBQ13",20,40000);
		Builder b4=new Builder("Nishi","GSTWBQ14",11,12000);
		Builder b5=new Builder("Nishi","GSTWBQ15",2,9000);
		ArrayList<Builder> al=new ArrayList<Builder>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);
		
		Collections.sort(al,new BuilderRevenueComparator());
		System.out.println(al);
		Collections.sort(al,new BuilderProjectComparartor());
		System.out.println(al);
	}
}
