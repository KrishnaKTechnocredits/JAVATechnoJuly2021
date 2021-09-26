package nishi;

public class ScodingTest8 {
	
	int getCountOfPair(int[] a)
	 {	
		int pair=0;
		int sum=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[i]==a[j] && a[j]!=0)
					{
						count++;
						a[j]=0;
					}				
			}			
			pair=count/2;		
			sum+=pair;		
		}
		return sum;
	 }
	 
	public static void main(String[] args) {
		int[] a= {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		System.out.println("Output :"+new ScodingTest8().getCountOfPair(a));
	}
}
