package arti_K;

public class SameClassStoNSCalling {
	
	int d = 30;
	
	void m4() {
		System.out.println("\nThis is Non Static m4() Method.");
	}
	
	static void m5() {
		SameClassStoNSCalling sns1 = new SameClassStoNSCalling(); //Can create object in any method. But its scope is limited to this method only.
		
		sns1.m4(); // S to NS method calling through object.
		
	}
	
	public static void main(String[] args) {
		SameClassStoNSCalling sns = new SameClassStoNSCalling();
		
		sns.m4();	// S to NS method calling through object.
		
		System.out.println(sns.d);	// S to NS variable calling through object.
	}
}
