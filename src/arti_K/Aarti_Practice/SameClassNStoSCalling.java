package arti_K.Aarti_Practice;

public class SameClassNStoSCalling {
	
	static int g = 4;
	
	static void m6() {
		System.out.println("\nThis is Static m6() method.");
	}
	
	void m7() {
		m6();	// NS to S Direct method calling.
		
		SameClassNStoSCalling.m6();	// NS to S method calling using ClassName.
		
		SameClassNStoSCalling nss = new SameClassNStoSCalling();
		
		nss.m6();	// NS to S method calling through object.
		
		System.out.println(g);      // NS to S Direct Variable calling through object.
		System.out.println(SameClassNStoSCalling.g);	// NS to S Direct method calling using ClassName.
		System.out.println(nss.g);	// NS to S method calling through object.
	}
	
	public static void main(String[] args) {
		SameClassNStoSCalling nss1 = new SameClassNStoSCalling();
		nss1.m7();
	}
}
