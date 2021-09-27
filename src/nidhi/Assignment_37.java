package nidhi;

/**Assignment - 37 : 23th Sep'2021
WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family
**/

class Assignment_37{
	
	String secLargestString(String input){
		String[] str=input.split(" ");
		int maxsz=0;
		int secmax=0;
		String output="";
		for (int i=0;i<str.length;i++){
			if (maxsz < str[i].length())
				maxsz = str[i].length();
		}
		for (int i=0;i<str.length;i++){
			if (secmax < str[i].length()) {
				if (str[i].length() < maxsz )
					secmax = str[i].length();
					output = str[i];
			}		
		}
		return output;
		
	}
	
	public static void main(String[] arg){
		Assignment_37 assignment= new Assignment_37();
		String input= "Welcome to the family hi";
		System.out.println(assignment.secLargestString(input));
	}
}