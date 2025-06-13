package santosh_Assignment51;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Client implements Comparator<Builder>{
	public static void main(String[] args) {
		Builder builder1=new Builder("Santosh",1111,10,1500);
		Builder builder2=new Builder("Santosh",1111,30,1500);
		Builder builder3=new Builder("Santosh",2321,50,5500);
		Builder builder4=new Builder("Santosh",2122,60,11000);
		Builder builder5=new Builder("Santosh",3131,40,25000);

		List<Builder> list=new ArrayList<Builder>();
		list.add(builder1);
		list.add(builder2);
		list.add(builder3);
		list.add(builder4);
		list.add(builder5);
		Collections.sort(list,new Builder(null, 0, 0, 0));
		System.out.println("\n"+list+"\n");
		Collections.sort(list,Collections.reverseOrder(new Client()));
		System.out.print(list);
	}
	@Override
	public int compare(Builder b1,Builder b2) {
		return b1.totalCompletedProject-b2.totalCompletedProject;
	}
}
