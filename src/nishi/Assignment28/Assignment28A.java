package nishi.Assignment28;

public class Assignment28A {
	int[] input= {10,23,2,11,55,43,99};
	
	int getNthMaxNumber()
	{
		int max=input[0];
		int pos=0;		
		for(int i=1;i<input.length;i++)
		{
			if(input[i]>max)
			{
				max=input[i];
				pos=i;
				
			}			
		}
		input[pos]=0;			
		return max;
	}
	
	int callingMaxNTimes(int n)
	{
		int nthMax=0;
		int i=0;
		while(i<n)
		{
			nthMax=getNthMaxNumber();
			i++;
		}
		return nthMax;	
	}
	
	
	public static void main(String[] args) {
	
		System.out.println("2nd Highest number is "+new Assignment28A().callingMaxNTimes(2));
		System.out.println("3rd Highest number is "+new Assignment28A().callingMaxNTimes(3));
	}

}
