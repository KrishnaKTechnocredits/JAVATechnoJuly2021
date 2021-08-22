package anurag;

public class MinNumber {
	int minNumber(int [] minNum)
	{
         int min=minNum[0];;
         for(int index=0;index<minNum.length;index++)
         {
        	if(minNum[index]<min)
        	 {
        		 min=minNum[index];
        	 }
          
         
         }
         return min;
	}
	public static void main(String[]args)
	{
		MinNumber minNum=new MinNumber();
		int [] inputMin= {1,11,44,23,50,99,23};
		System.out.println("Min number of given array - "+ minNum.minNumber(inputMin));
	}
}
