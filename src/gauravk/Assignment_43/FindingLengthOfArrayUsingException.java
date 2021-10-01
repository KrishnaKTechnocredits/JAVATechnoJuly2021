package gauravk.Assignment_43;

import java.util.Arrays;

/*
 * WAP to iterate over Array without using array length property
 */
public class FindingLengthOfArrayUsingException {
	
	int findingArrayLength(String [] str) {
		int i=0;
		while(true) {
			try {
				String s1 = str[i];
				i++;
			}catch(ArrayIndexOutOfBoundsException ae) {
				break;			
			}
		}
		/*{
			System.out.println("The length of the String ["+str+"] is "+i);
		}*/
		return i;
	}
	
	public static void main(String[] args) {
		String[] s = {"TechnoCredits","Java","OOPS","Selenium","Maulik","Krishna","Aashvi"};
		System.out.println("Finding the length of the Array. "+Arrays.toString(s)+" is "+new FindingLengthOfArrayUsingException().findingArrayLength(s));
	}
}
