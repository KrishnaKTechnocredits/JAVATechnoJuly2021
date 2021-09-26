/*Assignment 25 : 29th Aug'2021

Program 1:
String str = "te12ch33no3credit4s"; 
output = 12+33+3+4

Program2:
String str = "Ma1U2liK"
output : MUK12ali*/

package elizabeth;

class Assignment25{
	
	int getSumOfNumbers(String str){
		int sum=0;
		String temp="";
		for(int index=0;index<str.length();index++){
			char ch=str.charAt(index);
			if(Character.isDigit(ch)){
					temp=temp+ch;
				}else if(temp.length()>0){
					sum=sum+Integer.parseInt(temp);
					temp="";
				}
		}	
		if(temp.length()>0){
			sum=sum+Integer.parseInt(temp);
		}
		return sum;
	}
	
	String getOutput(String input){
		String upperCase="";
		String lowerCase="";
		String digit="";
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			if(Character.isUpperCase(ch)){
				upperCase=upperCase+ch;
			}
			else if(Character.isDigit(ch)){
				digit=digit+ch;
			}
			else{
				lowerCase=lowerCase+ch;
			}
		}
		String output=upperCase+digit+lowerCase;
		return output;
	}
	
	public static void main(String[] args){
		Assignment25 assignment25=new Assignment25();
		System.out.println("Output is " +assignment25.getOutput("Ma1U2liK"));
		System.out.println("Sum of all the numbers in the String: "+assignment25.getSumOfNumbers("te12ch33no3credit4s8"));
	}
	
}