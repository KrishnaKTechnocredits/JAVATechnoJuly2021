/*
 Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali
 */
package swati.Assignment25;

public class Assignment25 {
	
	void program1(String input) {
		int sum=0;
		String tempStr="";
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				tempStr=tempStr+input.charAt(index);
			}
			else if(tempStr!="") {
				sum=sum+Integer.parseInt(tempStr);
				tempStr="";
				}
			
			
		}
		System.out.println("Program1 Output:"+sum);
	}

	void program2(String input) {
		String digit="";
		String upperCase="";
		String lowerCase="";
		
		for(int index=0;index<input.length();index++) {
			if(Character.isDigit(input.charAt(index))) {
				digit=digit+input.charAt(index);
				
			}
			else if(Character.isUpperCase(input.charAt(index))) {
				upperCase=upperCase+input.charAt(index);
			}
			else if (Character.isLowerCase(input.charAt(index))){
				lowerCase=lowerCase+input.charAt(index);
			}
		}
	System.out.println("Program2 Output:"+upperCase+digit+lowerCase);
	}
	

	
	public static void main(String[] a) {
		Assignment25 assignment25=new Assignment25();
		assignment25.program1("te12ch33no3credit4s");
		assignment25.program2("Ma1U2liK");
	}
}
