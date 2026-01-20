package chirag.assignment49;

import java.util.HashSet;
import java.util.Set;

public class Client {
	
	public static void main(String[] args) {
		Builder b1=new Builder("Chirag","ABC1155333TT",8 ,1001 );
		Builder b2=new Builder("Rahul"," BNH9837786TU", 12, 978);
		Builder b3=new Builder("Aarti"," MJH9278583GN",3 , 1300);
		Builder b4=new Builder("Chirag","ABC1155333TT",8 ,1001 );
		Builder b5=new Builder("Priya"," KJH4872929RE",2 ,756 );

		Set<Builder> set=new HashSet<>();
		set.add(b1);
		set.add(b2);
		set.add(b3);
		set.add(b4);
		set.add(b5);

		System.out.println(set.size());
	}
}
