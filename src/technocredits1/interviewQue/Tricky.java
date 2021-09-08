package technocredits1.interviewQue;

public class Tricky {
	
	int x = 10;
	Object obj = 10.10;
	
	void m1(Object obj) {
		
	}
	
	void m2() {
		m1(10);
	}
	
	
	public static void main(String[] args) {
		Object obj = new Tricky();
		obj.hashCode();
		String str = "";
		String str1 = null;
		System.out.println(str.length());
		System.out.println(str1.length());
	}
}
