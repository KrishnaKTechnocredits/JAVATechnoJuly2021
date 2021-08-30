package indu;

public class MaxRepeatWord_A24_2 
{
	int findMaxRepeatWord(String str)
	{
		int count ,maxFrequency = 0;
		 
		String[] arr = str.split(" ");
		String maxRepWord ="";
		for (int i=0 ;i<arr.length;i++)
		{
			count=0;
			for(int j=0 ;j<arr.length;j++)
			{	
				if(arr[i].equalsIgnoreCase(arr[j]))
				{
					count++;
				}
				if(maxFrequency<count)
				{
					maxFrequency = count;
					maxRepWord=arr[i];
				}
			}
		}
		System.out.println(maxRepWord +" -> " +maxFrequency);
		return maxFrequency;
	}
	public static void main(String[] arf)
	{
		MaxRepeatWord_A24_2 maxRepeatWord_A24_2 = new MaxRepeatWord_A24_2();
		String input = "Hi Hello Techno Hello hi hi Hi Hello Hello Hi Hello Hi Techno";
		System.out.println("Input string : \n"+input);
		maxRepeatWord_A24_2.findMaxRepeatWord(input);
	}
}
