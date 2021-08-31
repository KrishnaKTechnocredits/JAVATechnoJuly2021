/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4*/

package monika;

public class Assignment25_Program_1 {

	int getsumOfNumbersinString(String input) {
		
			int sum = 0;
			String temp = "";
			for (int index = 0; index < input.length(); index++) {
				
				if (index<input.length() && Character.isDigit(input.charAt(index))) 
					temp += input.charAt(index);
				else
					if(temp !="") {
						sum += Integer.parseInt(temp);
						temp="";
				}
			}
			return sum;
		}
	
	public static void main(String[] args) {
		Assignment25_Program_1 assignment25_Program_1=new Assignment25_Program_1();	
		System.out.println("Sum of Numbers in given String is :"+assignment25_Program_1.getsumOfNumbersinString("te12ch33no3credit4s"));

	}
			
		
	}

