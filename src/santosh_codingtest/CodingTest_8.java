/*Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
 */ 
package santosh_codingtest;
public class CodingTest_8 {
	int getPairOfSocks(int[] a)
	 {	
		int socks=0;
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
			socks=count/2;		
			sum+=socks;		
		}
		return sum;
	 }

	public static void main(String[] args) {
		CodingTest_8 codingTest8 = new CodingTest_8();
		int[] a= {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
		System.out.println("o/p :- "+codingTest8.getPairOfSocks(a));
		
	}
}

