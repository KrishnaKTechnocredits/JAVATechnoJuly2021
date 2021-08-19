/*Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet*/
package elizabeth;

class Assignment17{
	
	
	String getReverseString(String input){
		String output="";
		for (int index=input.length()-1;index>=0;index--){
				output=output+input.charAt(index);
		}
		return output;
	}
	
	public static void main(String[] args){
		Assignment17 assignment17=new Assignment17();
		System.out.println("Reverse String is: ");
		System.out.print(assignment17.getReverseString("technocredits"));
	}
}