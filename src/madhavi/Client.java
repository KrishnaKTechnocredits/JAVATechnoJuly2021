package madhavi;

import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Builder b1 = new Builder("LODHA","AB234",10,60000);
		Builder b2 = new Builder("Kolte Patil","AB234",5,40000);
		Builder b3 = new Builder("Ravetkar","AB2994",9,20000);
		Builder b4 = new Builder("Paranjape","DN234",1,50000);
		Builder b5 = new Builder("LODHA","AB234",10,60000);
		
		System.out.println("HashCode of b1 - " + b1.hashCode());
		System.out.println("HashCode of b2 - " + b2.hashCode());
		System.out.println("HashCode of b4 - " + b4.hashCode());
		System.out.println("HashCode of b5 - " + b5.hashCode());
		System.out.println(b2.equals(b4));
		HashSet<Builder> setOfBuilder = new HashSet<>();
		setOfBuilder.add(b1);
		setOfBuilder.add(b2);
		setOfBuilder.add(b3);
		setOfBuilder.add(b4);
		setOfBuilder.add(b5);
		
		System.out.println(setOfBuilder.size()); // 4
}
}