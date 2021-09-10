/*Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/

package Anuja_Assignment_25;

public class Program1 {

	void display(String str) {
		for(int i=0;i<str.length();i++) {
			int num=0;
			int digit,digit1=0;
			char ch=str.charAt(i);
			if(Character.isDigit(ch)==true) {
				String temp=Character.getNumericValue(ch)+"";
				digit=Integer.parseInt(temp); 
				char ch1=str.charAt(i+1); 
				if(Character.isDigit(ch1)==true) {
					i++;
					String temp1=Character.getNumericValue(ch1)+"";
					digit1=Integer.parseInt(temp1); 
					String xyz=""+digit+digit1;
					num=Integer.parseInt(xyz); 
					if(i!=(str.length()-2 ))	{			
						System.out.print(num+"+");
					}
					else 
						System.out.print(num);
				}
				else if(Character.isDigit(ch1)==false) {
					if(i!=(str.length()-2))	{			
						System.out.print(digit+"+");
					}
					else 
						System.out.print(digit);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str="te12ch33no3credit4s";
		Program1 program1=new Program1();
		program1.display(str);
	}
}
