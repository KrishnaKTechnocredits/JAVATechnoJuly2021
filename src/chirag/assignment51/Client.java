package chirag.assignment51;

import java.util.ArrayList;
import java.util.Collections;

public class Client {
	
	public static void main(String[] args) {
		
			Builder b1=new Builder("Chirag", "AACV11100423", 4, 2500000);
			Builder b2=new Builder("Rahul", "TGDF14100532", 12, 1100000);
			Builder b3=new Builder("Aarti", "KJLG10100765", 8, 3700000);
			Builder b4=new Builder("Krish", "TMNb12710093", 19, 98769);
			Builder b5=new Builder("Amol", "CVVA120500702", 5, 1432880);
			
			ArrayList<Builder> al=new ArrayList<>();
			al.add(b1);
			al.add(b2);
			al.add(b3);
			al.add(b4);
			al.add(b5);
			
			Collections.sort(al, new BuildersRevenue());
			System.out.println("Sorting builders revenue\n");
			System.out.println(al);
			System.out.println("-------------------------------------");
			Collections.sort(al, new BuildersTotalCompletedProjects());
			System.out.println("Sorting builder list based on total completed projects\n");
			System.out.println(al);
		}
	}
