/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15.2 years of exp";
output : 15
         3*/

package parthav;

public class ExceptionHandlingAssignment40 {

	void printNumbersFromString(String str){
	
		String [] arr = str.split(" ");
		double num = 0;
		
		
		for (int index = 0;index < arr.length; index++){
			try {
			num = Double.parseDouble(arr[index]);
			}
			catch (NumberFormatException ne){
				continue;
			}
			System.out.println(num);
			
			
		}
	}

	public static void main(String[] args) {
		ExceptionHandlingAssignment40 newObject = new ExceptionHandlingAssignment40();
		String str = "I have 5 years and 3 months of exp";
		newObject.printNumbersFromString(str);
		str = "I have 15.2 years of exp";
		newObject.printNumbersFromString(str);
	}

}
