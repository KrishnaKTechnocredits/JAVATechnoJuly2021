package indu;

public class GetNthPerfectNumber {

	void getPerfectNumber(int num)
	{
		System.out.println("The First "+ num + " Perfect numbers are : ");
		int index=1;
		int count =0;
		int perfectNum;
		
		while(count<=num)
		{perfectNum =0;
			int number =1;
			while(number<index)
			{
				if(index % number==0)
					perfectNum+=number;
				number++;
			}
			
			if(perfectNum==index)
			{
				count++;
				System.out.println(index);
			}
			index++;
		}
	}
	
	public static void main(String[] args) {
		GetNthPerfectNumber test5 = new GetNthPerfectNumber();
		test5.getPerfectNumber(5);
	}
}
