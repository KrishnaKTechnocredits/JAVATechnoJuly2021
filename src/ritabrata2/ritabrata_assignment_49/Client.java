/*Assignment - 49 : 10th Oct [hashCode & Equals]

Create a class call builder.
-> builder has 4 attributes
-> name, gstNumber, totalCompletedProject, Revenue
-> pass parameter values while object creation.

Create a client class.
-> create 5 objects of builder class by passing values to constructor.
-> all parameters are same for 2 objects
-> Create a set and return only unique builder information.
 -> uniqueness should be based on name, gstNumber, Revenue.
-> Expected answer is - 4.
*/

package ritabrata2.ritabrata_assignment_49;
import java.util.HashSet;
public class Client {

	public static void main(String[] args) {
		Builder b1 = new Builder("Ritabrata", "1234a", 100, 100000);
		Builder b2 = new Builder("Ritabrata", "1234a", 100, 100000);
		Builder b3 = new Builder("Ritabrata", "4321b", 101, 90000);
		Builder b4 = new Builder("techno", "5678c", 102, 80000);
		Builder b5 = new Builder("credits", "8765d", 103, 70000);
		
		HashSet<Builder> setOfBuilders = new HashSet<Builder>();
		setOfBuilders.add(b1);
		setOfBuilders.add(b2);
		setOfBuilders.add(b3);
		setOfBuilders.add(b4);
		setOfBuilders.add(b5);
		System.out.println(setOfBuilders.size());

	}

}
