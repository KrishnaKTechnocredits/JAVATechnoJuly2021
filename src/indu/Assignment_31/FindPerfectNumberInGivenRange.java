package indu.Assignment_31;

import java.util.Scanner;

public class FindPerfectNumberInGivenRange
{					
	void perfectNumberInRange(int start,int end)
	{	
		System.out.println("The perfect numbers from range "+start+" - "+end+ " is : ");
		for(int index=start;index<=end ;index++)
		{	boolean flag=false;
			int i=1;
			
			int perfectNUmber=0;
			while(i<index)
			{
				if(index % i==0)
					perfectNUmber += i;
			i++;
			}
				
			if(perfectNUmber==index )
				flag= true;
			else
				flag= false;
			
			
			if(flag)
				System.out.println(index+"");	
			
			}		
		}
	

		public static void main(String[] args) {
			FindPerfectNumberInGivenRange findPerfectNumberInGivenRange = new FindPerfectNumberInGivenRange();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the range to find perfect Square: ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			findPerfectNumberInGivenRange.perfectNumberInRange(num1, num2);		}
}
