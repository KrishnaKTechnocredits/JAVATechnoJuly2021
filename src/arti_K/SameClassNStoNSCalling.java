package arti_K;

public class SameClassNStoNSCalling {

	int p = 10;
	
	void m1() {
		System.out.println("\nThis is Non-Static m1() method.");
	}
	
	void m2() {
		m1();	// NS to NS Direct method calling
		
		SameClassNStoNSCalling nonstatic = new SameClassNStoNSCalling();
		nonstatic.m1();		// NS to NS method calling through object. 
		
		System.out.println(p);				// NS to NS Direct variable calling
		System.out.println(nonstatic.p);	// NS to NS variable calling through object.
	}
	
	public static void main(String[] args) {
		SameClassNStoNSCalling ns = new SameClassNStoNSCalling();
		ns.m2();
	}
}
