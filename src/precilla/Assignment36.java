
/*Assignment 36: 22nd Sep 2021

WAP to swap vowel in String mean last first vowel should replace first vowel in String and vice verse
*/
package precilla;

public class Assignment36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="good morning";
		System.out.print("Input: "+input);
		
		char vowel[]=new char[input.length()];
		int indexCount[]=new int[input.length()];
		int count=0;
		for(int index=0;index<input.length()-1;index++) {
			{
				if(input.charAt(index)=='a'||input.charAt(index)=='e'||input.charAt(index)=='i'||input.charAt(index)=='o'||input.charAt(index)=='u') {
					vowel[count]=input.charAt(index);
					indexCount[count]=index;
					count++;
				}
			}
		}
		
		char ch[]=input.toCharArray();
		int count2=0;
		
		for(int index=vowel.length-1;index>=0;index--) 
		{
		    if(vowel[index]!='\u0000')
		    {
			    ch[indexCount[count2]]=vowel[index];
			    count2++;
		    }
		}
		String str=String.valueOf(ch);
		System.out.print("\nOutput: "+str);
	}

}