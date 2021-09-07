package gauravk.Assignment_26;
/*
 * Assignment - 26 : 1st Sep'2021

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
swap 2 numbers without using 3rd variable
 */
public class ReverseStringArraySequence {
	
	String [] reversingOrderOfArray(String[] arr) {
		String[] ans = new String [arr.length];
		for(int j=0,i=arr.length-1; i>=0; j++,i--) {
			ans[j] = arr[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String [] input = {"Credits", "Techno","From","Diwali","Happy"};
		ReverseStringArraySequence reverse = new ReverseStringArraySequence();
		String [] output = reverse.reversingOrderOfArray(input);
		System.out.print("{ ");
		for(int i=0; i<input.length; i++) {
			System.out.print(output[i]+" ");
		}
		System.out.println("}");
	}
}