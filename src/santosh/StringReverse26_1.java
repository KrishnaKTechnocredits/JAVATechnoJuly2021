/* Assignment - 26 : 

Program : 1 
WAP to print Reverse a given String.
input : This is technocredits
output : stiderconhcet si sihT  

Program : 2 
reverse given string array.
input : {"Credits", "Techno","From","Diwali","Happy"}
output : {"Happy","Diwali","From","Techno","Credits"}

Program : 3 
swap 2 numbers with using 3rd variable

Program : 4 
swap 2 numbers without using 3rd variable */
package santosh;
public class StringReverse26_1 {
	String reverseString(String input) {
		String output="";
		for(int index=input.length()-1;index>=0;index--) {
			output+=input.charAt(index);
		}
		return output;
	}
	public static void main(String[] args) {
		StringReverse26_1 stringReverse=new StringReverse26_1();
		String str=stringReverse.reverseString("This is technocredits");
		System.out.println("Output: "+str);

	}

}
