/* Finding digits from a string using exception handling*/
package shantanu.exceptionHandling_assignment40;

public class ExceptionHandling {
		public static void main(String[] args) {
			String str="I have 15 years and 9 months of exp";
			System.out.println("String : "+str);
			String[] strArr=str.split(" ");
			System.out.print("Output : ");
			for(int i=0;i<strArr.length;i++) {
				try {
					int num=Integer.parseInt(strArr[i]);
					System.out.print(num+" ");
				}catch(NumberFormatException e) {
				
				}
			}
		}

	}
