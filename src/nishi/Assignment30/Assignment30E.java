package nishi.Assignment30;

import java.util.Scanner;

public class Assignment30E {
	
	String getPerfectSquare(int num)
	{
		boolean flag=false;
		int temp=0;
		for(int i=1;i<num;i++)
		{
			temp=(int) Math.pow(i, 2);
			if(temp==num)
			{
				flag=true;				
				break;
			}
			else
			{
				flag=false;
			}
		}		
		if(flag)
			return num+ " is perfect square";
		else
			return num+ " is not perefct square";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		System.out.println(new Assignment30E().getPerfectSquare(num));
		sc.close();
	}

}
