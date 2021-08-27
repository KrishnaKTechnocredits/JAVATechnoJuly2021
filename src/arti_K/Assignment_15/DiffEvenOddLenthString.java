/* *program 1*:  wap that will return difference of even length name sum and odd lenght name sum.
arr[0] = "Maulik";		
arr[1] = "Techno";		
arr[2] = "Nidhi";	
arr[3] = "Ankit";
output : 2
 */

package arti_K.Assignment_15;

public class DiffEvenOddLenthString {
		
	int takeStringArray(String[] str) {
		int difference;
		int maxoddlen = 0;
		int maxevenlen = 0;
		for(int index=0; index < str.length; index++){
			if(str[index].length() % 2 == 0)
				maxevenlen = maxevenlen + str[index].length();
			else
				maxoddlen = maxoddlen + str[index].length();
		}
		if(maxoddlen > maxevenlen)
			difference = maxoddlen - maxevenlen;
		else
			difference = maxevenlen - maxoddlen ;
			
		return difference;	
	}
	
	public static void main(String[] args) {
		
		String[] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";		
		arr[2] = "Nidhi";		
		arr[3] = "Ankit";
		
		DiffEvenOddLenthString diff = new DiffEvenOddLenthString();
		System.out.println("Difference of even length name and odd lenght name : "+diff.takeStringArray(arr));
	}
}
