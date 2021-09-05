package technocredits.oops.p2;

public class GrandChild extends Child{

	void m3() {
		GrandChild grandChild = new GrandChild();
		System.out.println(grandChild.c);
		
		Child child = new GrandChild();
		System.out.println(child.x);
	}
}
