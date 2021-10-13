/*Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.

Exception : while printing arrayList, it should print build names and
 revenue based on revenue ascending order.*/


package elizabeth_Assignment_50;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	
	public static void main(String[] args) {
	Builder b1=new Builder("eliza",1234,4,20000);
	Builder b2=new Builder("mary",1245,5,30000);
	Builder b3=new Builder("lizzie",1256,6,40000);
	Builder b4=new Builder("marc",1278,7,50000);
	Builder b5=new Builder("james",1289,8,60000);
	
	ArrayList<Builder>al=new ArrayList<Builder>();
	al.add(b1);
	al.add(b2);
	al.add(b3);
	al.add(b4);
	al.add(b5);
	
	Collections.sort(al);
	System.out.println(al);
	
	}
}
