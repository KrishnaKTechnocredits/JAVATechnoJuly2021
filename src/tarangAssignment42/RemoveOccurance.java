package tarangAssignment42;
/*Program 1: Remove multiple occurrence of characters from given string.

output : technordis

Program 2: Remove all occurrence of duplicate character from given string.
input : "technocredits"
output : "hnordis"*/
public class RemoveOccurance {

	//program1
	String removeMultipleOccurence(String str)
	{
		String output = "";
		for(int i =0;i<str.length();i++)
		{	
			if(str.indexOf(str.charAt(i))== i)
			{
				output+=str.charAt(i);

			}
		}
		return output;
	}
	
	//program2
	String removeAllOccoranceofDuplicateChar(String str)
	{
		int count;
		String output = "";
		for(int i =0;i<str.length();i++)
		{	count =0;
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))
			{
				count++;
			}
			if(count==1)
				output +=str.charAt(i);	
		}

		return output;
	}
	
	public static void main(String[] args) {
		RemoveOccurance e1 =  new RemoveOccurance();
		String str = "technocredits";
		System.out.println("Remove multiple occurance output : "+e1.removeMultipleOccurence(str));
		System.out.println("Remove all occurance output : "+e1.removeAllOccoranceofDuplicateChar(str));
	}

}
