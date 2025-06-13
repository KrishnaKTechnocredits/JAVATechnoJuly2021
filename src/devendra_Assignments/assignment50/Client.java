package devendra_Assignments.assignment50;
/*
Assignment - 50 : 10th Oct'2021 [Comparable]
Write a method to sort builder object based on revenue;

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> Create a list, add all builder objects and sort it.
-> override toString method to print builder name, revenue.
*/
import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Akshay", "ABCD1110022", 4, 2500000);
		Builder b2 = new Builder("Akash", "EFGH1110033", 8, 1500000);
		Builder b3 = new Builder("Amit", "IJKL1110044", 12, 3500000);
		Builder b4 = new Builder("Amol", "MNOP1110055", 16, 950000);
		Builder b5 = new Builder("Aniket", "QRST1110066", 20, 1450000);

		ArrayList<Builder> al=new ArrayList<>();
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(b5);

		Collections.sort(al);
		System.out.println(al);
	}
}
