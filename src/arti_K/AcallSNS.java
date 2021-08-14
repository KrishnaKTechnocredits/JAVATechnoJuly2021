package arti_K;

public class AcallSNS {
	
	int t = 5;
	static int h = 15;
	
	
	static void m1() {
		BcallSNS.m4(); // S to S method calling of class B using className.
		
		BcallSNS b1 = new BcallSNS();
		b1.m4(); 	// S to S method calling of class B by creating object.
		
		System.out.println(BcallSNS.x);	// S to S variable calling of class B using className.
		System.out.println(b1.x);	// S to S Variable calling of class B by creating object.
	}
	
	void m2() {
		BcallSNS b2 = new BcallSNS();
		b2.m3();  					// NS to NS method calling of class B by creating object.
		System.out.println(b2.k);	// NS to NS variable calling of class B by creating object.
	}
	
	void m5() {
		BcallSNS.m4();			// NS to S method calling of class B using className.
		BcallSNS b3 = new BcallSNS();
		b3.m4();  				// NS to S method calling of class B by creating object.
		
		System.out.println(BcallSNS.x); 	// NS to S variable calling of class B using className.
		System.out.println(b3.x);  			// NS to NS variable calling of class B by creating object.
	}
	
	public static void main(String[] args) {
		
		BcallSNS b4 = new BcallSNS();
		b4.m3();					// S to NS method of class B calling by creating object.
		System.out.println(b4.k);	// S to NS Variable of class B calling by creating object.
		
		AcallSNS a1 = new AcallSNS();
		m1();
		a1.m2();
		a1.m5();
		
	}
}
