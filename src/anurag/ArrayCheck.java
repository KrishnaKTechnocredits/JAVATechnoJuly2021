package anurag;

public class ArrayCheck {

		int [] firstInput= {1,-11,-44,23,55,-99,-23,-22};
		int [] secondInput= {1,-11,0,0,55,0,-23,0};
		int positiveCount;
		int zeroCount;
		void countPositive()
		{
			int index;
			for(index=0 ; index <firstInput.length ; index++)
			{
				if(firstInput[index]>0)
				{
					positiveCount++;
				}
			}
		}
		void countZero()
		{
			int index;
			for(index=0 ; index <secondInput.length ; index++)
			{
				if(secondInput[index]==0)
				{
					zeroCount++;
				}
			}
			
		}
		int[] getNumber(int num)
		{
			int []output= new int[5];
			for(int index=0;index<5;index++)
			{
				num--;
				output[index]=num;
			System.out.println(output[index]);
			}
			
			 return output;
		}
		
		public static void main(String []args)
		{
			ArrayCheck arr=new ArrayCheck();
			arr.countPositive();
			System.out.println("Positive number count - "+arr.positiveCount);
			arr.countZero();
			System.out.println("Zero count  - "+arr.zeroCount);
		    System.out.println("First 5 numbers less than 50");
			arr.getNumber(50);
		}
	}



