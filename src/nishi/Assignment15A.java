package nishi;

public class Assignment15A {
	
	int differenceOfEvenAndOddLength(String[] a)
	{
		int evenCnt=0;
		int oddCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].length()%2==0)
				evenCnt+=a[i].length();
			else
			    oddCnt+=a[i].length();	
			
		}
		return evenCnt-oddCnt;
	}

	public static void main(String[] args) {
		Assignment15A assignment15a=new Assignment15A();
		String[] a= {"Maulik","Techno","Nidhi","Ankit"};
		System.out.println("Difference of Even length & Odd Length : "+assignment15a.differenceOfEvenAndOddLength(a));

	}

}
