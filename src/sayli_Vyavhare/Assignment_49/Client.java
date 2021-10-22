package sayli_Vyavhare.Assignment_49;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

			Builder builder1 = new Builder("Sayli", "ABCDE23232", 15, 100);
			Builder builder2 = new Builder("Sakshi", "MNOPQ48484", 15, 135);
			Builder builder3 = new Builder("Atharv", "JKLMN25252", 20, 120);
			Builder builder4 = new Builder("Manoj", "GHIJK98989", 25, 150);
			Builder builder5 = new Builder("Sakshi", "MNOPQ48484", 15, 135);
			
			Set<Builder> hset=new HashSet<Builder>();
			hset.add(builder1);
			hset.add(builder2);
			hset.add(builder3);
			hset.add(builder4);
			hset.add(builder5);
			System.out.println("Size:"+hset.size());
	}

}
