//WAP tp print reverse a given string

package anuja_Assignment_26;

public class Prog1 {

	void reverseString(String arr) {
		String out="";
		for(int i=arr.length()-1;i>=0;i--) {
			out+=arr.charAt(i);
		}
		System.out.println(out);
	}

	public static void main(String[] args) {
		Prog1 prog1=new Prog1();
		String arr= "This is technocredits";
		prog1.reverseString(arr);
	}
}
