package technocredits.oops.p2;

import technocredits.oops.p1.Parent;

public class Child extends Parent{
	protected int x = 10;
	static void m1() {
		//System.out.println(d);
		//System.out.println(c);
		
		Child child = new Child();
		System.out.println(child.c);
	}
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		//parent.
	}
}
