/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
package mayur.ExceptionHandlingAssignment_40;

public class Assignment40 {
	public static void main(String[] args) {
		String str = "I have 15 years and 9 months of exp";
		System.out.println("String :" +str);
		String[] str1 = str.split(" ");
		System.out.print("output : ");
		for(int index =0;index<str1.length;index++) {
			try {
				int num = Integer.parseInt(str1[index]);
				System.out.print(num+ " ");
			}catch(NumberFormatException e) {
				
			}
		}

	}

}
