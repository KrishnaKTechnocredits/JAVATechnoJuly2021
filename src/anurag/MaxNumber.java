package anurag;

public class MaxNumber {
	
	int maxNumber(int [] maxNum)
	{
         int max=0;
         for(int index=0;index<maxNum.length;index++)
         {
        	 if(maxNum[index]>max)
        	 {
        		 max=maxNum[index];
        	 }
          }
         return max;
	}
	
	 public static void main(String[]args)
    {
    	MaxNumber maxNum=new MaxNumber();
    	int [] inputMax= {1,11,44,23,55,99,23};
    	System.out.println("Max number of given array - "+ maxNum.maxNumber(inputMax));
	}
}
