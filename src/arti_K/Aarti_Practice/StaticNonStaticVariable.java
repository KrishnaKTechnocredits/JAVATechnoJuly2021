// Understand the Static variable and Non-Static variable concept

package arti_K.Aarti_Practice;

public class StaticNonStaticVariable {
	
	static int x = 10;
	int y= 20;
	
	void processData() {
		x++;
		y++;
	}
	void display() {
		System.out.println("Value of x : "+x);
		System.out.println("Value of y : "+y);
	}
	public static void main(String[] args) {
		StaticNonStaticVariable var1 = new StaticNonStaticVariable();
		
		var1.processData();		// x = 11,  y = 21
		var1.processData();		// x = 12,  y = 22
		
		StaticNonStaticVariable var2 = new StaticNonStaticVariable();
		
		var2.processData();		// x = 13,  y = 21
		
		var1.display();		// x = 13,  y = 22
		var2.display();		// x = 13,  y = 21
	}
}
