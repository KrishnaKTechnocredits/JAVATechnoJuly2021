/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
package shreya_assignment_40_exception_handling;

public class ExceptionHandling {
	void getValue(String input) {
		String[] arr=input.split(" ");
		System.out.println("Numbers from the string are : ");
		for(int index=0;index<arr.length;index++) {
			try {
				int num=Integer.parseInt(arr[index]);
				System.out.println(num);
		    }
			catch(NumberFormatException ne){
				//System.out.println("NumberFormatException occured");
			}
		}
	}
	public static void main(String[] args) {
		ExceptionHandling exceptionHandling = new ExceptionHandling();
		String str="I have 15 years and 9 months of exp";
		exceptionHandling.getValue(str);
	}

}
