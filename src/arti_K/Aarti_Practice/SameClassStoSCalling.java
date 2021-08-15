package arti_K.Aarti_Practice;

public class SameClassStoSCalling {
	
	int a = 10;
	static int c = 40;
	
	static void m3() {
		System.out.println("This is Static m3() method.");
	}
	
	public static void main(String[] args) {
		
		m3();		// Static-Static method Direct Calling 
		
		SameClassStoSCalling.m3(); 	// Static-Static method Calling using ClassName ---> Best practice
		
		SameClassStoSCalling staticcall = new SameClassStoSCalling();
		staticcall.m3();		// Static-Static method Calling through object 
		
		System.out.println(c);						// Static-Static variable Direct Calling ---> Best practice
		System.out.println(SameClassStoSCalling.c); // Static-Static variable Calling using ClassName 
		System.out.println(staticcall.c);			// Static-Static variable Calling through object 
	}

}
