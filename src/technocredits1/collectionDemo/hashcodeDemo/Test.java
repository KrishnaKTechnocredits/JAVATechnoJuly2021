package technocredits1.collectionDemo.hashcodeDemo;

public class Test {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Maulik");
		Employee e2 = new Employee(2, "Amruta");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		Employee e3 = new Employee(1,"Kanani");
		System.out.println(e3.hashCode());
		
		System.out.println(e1 == e3);
	}
}
