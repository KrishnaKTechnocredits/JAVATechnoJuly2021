package technocredits1.oops.p1;

public class B extends A{
	
	@Override
	public String toString() {
		return "Hi";
	}
	 static void m1(){
		 System.out.println("Hello");
	 }
	 
	 private String m11() {
		 System.out.println(2);
		 return "Atul";
	 }
	 
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1(); // HI
		
		B b1 = new B();
		b1.m1(); // Hello
		
		A a2 = new B();
		a2.m1(); //Hi
		
		System.out.println(a2.x); // 
	}
}
