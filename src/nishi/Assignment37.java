/*WAP to find a second largest word.

Example:
Input: Welcome to the family
Output: family*/

package nishi;


public class Assignment37 {
	
	String getSecondLargestWord(String word)
	{
		String[] arr=word.split(" ");
		String word1="";
		int secondMaxCnt=getSecondMaxLengthWord(word);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()==secondMaxCnt)
			{
				word1=arr[i];
				break;
			}
		}
		return word1;
	}
	
	int  getSecondMaxLengthWord(String input)
	{
		String[] a=input.split(" ");
		int[] length=new int[a.length];
		int max=0;
		int secondMax=0;		
		for(int i=0;i<a.length;i++)
		{
			length[i]=a[i].length();
			if(length[i]>max)
			{
				max=length[i];
			}		
		}
	
		for(int j=0;j<a.length;j++)
		{
			if(length[j]>secondMax && length[j]!=max)
			{
				secondMax=length[j];
			}
		}
		
		return secondMax;
	}
	
	public static void main(String[] args) {
		String input="Welcome to the family";
		System.out.println(new Assignment37().getSecondLargestWord(input));
	}
}
