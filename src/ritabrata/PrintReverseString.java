/*Assignment - 17 : 18th Aug'2021
Write a method which takes one String parameter and return a reverse String.

Hint : String getReverseString(String input){

return output;
}

input : technocredits
output : stiderconhcet*/

package ritabrata;

public class PrintReverseString {
	void getReverseString(String name) {
		char reverse = 0;
		System.out.print("The reverse of "+name+" is: ");
		for(int index=name.length()-1; index>=0; index--) {
			reverse=name.charAt(index);
			System.out.print(reverse);
		}
		
	}

	public static void main(String[] args) {
		PrintReverseString arr= new PrintReverseString();
		String name1= "technocredits";
		arr.getReverseString(name1);
		System.out.println("\n-----------------------------------------------------");
		String name2= "RitAbraTa BhattaCharyyA";
		arr.getReverseString(name2);

	}

}
