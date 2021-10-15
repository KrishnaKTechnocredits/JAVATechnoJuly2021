package nishi.Assignment53;

public class Pattern16 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			int x='A';
			int y='a';
			for(int j=1;j<=i;j++)
			{
				if(i%2!=0)
					System.out.print(Character.toChars(x++));
				else
					System.out.print(Character.toChars(y++));
			}
			System.out.println();
		}
	}
}
