/*Program  that requires exception handling ...*/
package precilla.assignment40;

public class StringProgram {
	public static void main(String[] args) {
		String str="I have 15 years and 9 months of exp";
		System.out.println("String : "+str);
		String[] str1=str.split(" ");
		System.out.print("Output : ");
		for(int i=0;i<str1.length;i++) {
			try {
				int num=Integer.parseInt(str1[i]);
				System.out.print(num+" ");
			}catch(NumberFormatException e) {
			
			}
		}
	}

}
