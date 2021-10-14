package nishi.Assignment49;

import java.util.HashSet;
import java.util.Set;

public class Client {
	public static void main(String[] args) {
		Builder b1=new Builder("Nishi","GSTWBQ11",10,10000);
		Builder b2=new Builder("Rahul","GSTWBQ12",5,20000);
		Builder b3=new Builder("Saurav","GSTWBQ13",20,40000);
		Builder b4=new Builder("Nishi","GSTWBQ11",10,10000);
		Builder b5=new Builder("Nishi","GSTWBQ15",2,9000);
		Set<Builder> set=new HashSet<Builder>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);
		System.out.println("Expected answer is "+set.size());
	}
}
