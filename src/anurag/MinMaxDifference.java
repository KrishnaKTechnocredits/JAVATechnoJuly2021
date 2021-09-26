package anurag;

public class MinMaxDifference {
	int minMax(int [] minMax)
	{
		int max=0;
		int min=minMax[0];
		int diffrence;
		for(int index =0;index<minMax.length;index++)
		{
			 if(minMax[index]>max)
        	 {
        		 max=minMax[index];
        	 }
		
			 if(minMax[index]<min)
        	 {
        		 min=minMax[index];
        	 }
		}
		diffrence=max-min;
		return diffrence;
	}
	public static void main(String[]args)
	{
		MinMaxDifference minMax=new MinMaxDifference();
		int [] inputMinMax= {1,11,44,23,55,99,23};
		System.out.println("Difference min max number of given array - "+ minMax.minMax(inputMinMax));
	}

}
