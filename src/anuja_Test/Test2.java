package anuja_Test;

public class Test2 {
	String name="A1ashVi6";

	void display() {
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));
				//str[i]=Character.toLowerCase(ch);
			}
			else if(Character.isLowerCase(ch)) {
				System.out.print(Character.toUpperCase(ch));
				//str[i]=Character.toLowerCase(ch);
			}
			else if(Character.isDigit(ch)) {
				System.out.print(ch);
				//str[i]=ch;
			}
		}
	}

	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.display();
	}
}

