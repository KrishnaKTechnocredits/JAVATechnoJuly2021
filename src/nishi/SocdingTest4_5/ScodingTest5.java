package nishi.SocdingTest4_5;

public class ScodingTest5 {	

		boolean getPerfectNumber(int number)
		{		
			int sum=0;
			for(int i=1;i<number;i++)
			{		
				if(number%i==0)
				{
					sum+=i;
				}
			}
			
			if(sum==number)
				return true;
			else
				return false;
		}
		
		void displayPerfectNos(int count)
		{
			int num=1;
			while(count<=5)
			{
				if(getPerfectNumber(num))
				{
					System.out.println(num);
					count--;
				}
				num++;
			}
		}
		
		public static void main(String[] args) {
			new ScodingTest5().displayPerfectNos(5);
		}

}
