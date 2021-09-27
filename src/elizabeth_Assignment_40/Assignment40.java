/*Assignment-40 : 26th Sep'2021

Program  that requires exception handling ...
String str = "I have 5 years and 3 months of exp";
str = "I have 15 years and 9 months of exp";
output : 15
         3*/

package elizabeth_Assignment_40;
		 
class Assignment40{
	
	void getNumbersFromString(String str){
		String arr[]=new String[str.length()];
		arr=str.split(" ");
		for(int index=0;index<arr.length;index++){
			try{
				int num=Integer.parseInt(arr[index]);
				System.out.println(num);
			}
			catch(NumberFormatException ne){
				//Exception Handled
			}
		}
	}
	
	public static void main(String[] args){
		Assignment40 assignment40=new Assignment40();
		assignment40.getNumbersFromString("I have 5 years and 3 months of exp");
		assignment40.getNumbersFromString("I have 15 years and 9 months of exp");
	}
}
