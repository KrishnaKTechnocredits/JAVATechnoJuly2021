/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/
package purshottamJoshi;	 
class Assignment40{

	void getNumberFromString(String input){
		String[] str=input.split(" ");
		for(int index=0; index < str.length; index++){
			try{
			
				System.out.println(Integer.parseInt(str[index]));
				
			}catch(NumberFormatException ne){
				//System.out.println
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "I have 5 years and 3 months of exp";
		new Assignment40().getNumberFromString(str);
	}
}