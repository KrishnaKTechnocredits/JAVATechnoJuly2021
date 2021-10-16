package nishi.Assignment53;

public class Pattern10 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{			
				System.out.print(++count+" ");
			}
			System.out.println();
		}
	}
}
