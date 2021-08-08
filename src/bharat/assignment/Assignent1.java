package bharat.assignment;

public class Assignent1 {

	void display (int startIndex,int endIndex)
	{
		for(int i=startIndex;i<=endIndex;i++) {
			
			if(i%2==0) {
				
			System.out.println(i);
			} 
	       }	
		}
	void displayone(int start,int end)
		{
		
		for(int j=start;j<=end;j++) {
			if(j%5==0) {
				
			System.out.println(j);
			}
		}	
}
	void displaytwo(int range1,int range2)
	{
		for(int k=range1;k<=range2;k++) {
			if(k%5==0 && k%3==0) {
				System.out.println(k);
			}
		}
	}
	void displaythree(int startValue,int endValue) {
		for(int l=startValue;l<=endValue;l++) {
			if(l%7==0 || l%13==0) {
				System.out.println(l);
			}
		}
	}
	void displayFour(int sumStart,int sumEnd) {
		int sum=0;
		for(int m=sumStart;m<=sumEnd;m++) 
		sum=sum+m;
		{
			System.out.println("Sum is "+sum);
		}
		}
	void displayFive(int d,int e) {
		int even=0;
		int odd=0;
	
		for(int x=d;x<=e;x++) {
			if(x%2==0) {
			even=even+x;
			}
			else {
				odd=odd+x;
				{
					System.out.println(odd-even);
				}
			
			}
		}
	}
	void displaysix (int a,int b) {
		for(int n=b;n>=a;n--) {
			if(n%2!=0) {
				System.out.println(n);
			}
			
		}
	}
public static void main(String args[])
{
	Assignent1 assignent1=new Assignent1();
	assignent1.display(10,15);
	
	assignent1.displayone (10,30);
	
	assignent1.displaytwo(5, 18);
	
	assignent1.displaythree(5, 40);
	
	assignent1.displayFour(1, 5);
	
	assignent1.displayFive(3, 9);
	
	assignent1.displaysix(10, 20);
	}
}
