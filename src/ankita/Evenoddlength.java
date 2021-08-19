package ankita;

public class Evenoddlength {
	int diffLength (String [] arr) 
	{
		int evensum=0;
		int oddsum=0;
		for(int index=0;index<arr.length;index++) 
		if(arr[index].length()%2==0)
			evensum+=arr[index].length();
			else
			oddsum+=arr[index].length();
		return evensum-oddsum;
	}
	
	public static void main(String[] args) {
		Evenoddlength evenoddlength=new Evenoddlength();
		String [] arr= {"maulik","techno","nidhi","ankit"};
		evenoddlength.diffLength(arr);
		System.out.println("Even Odd length difference is " +evenoddlength.diffLength(arr));
	}
}
