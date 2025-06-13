
package santosh_Assignment50;
import java.util.ArrayList;
import java.util.Collections;
public class Client {
	public static void main(String[] args) {
		Builder b1=new Builder("Aniket",4111,7,15000);
		Builder b2=new Builder("Santosh",1111,9,5000);
		Builder b3=new Builder("Harsh",5478,5,7000);
		Builder b4=new Builder("Maulik",9632,3,19000);
		Builder b5=new Builder("Aniket",4111,7,15000);

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
