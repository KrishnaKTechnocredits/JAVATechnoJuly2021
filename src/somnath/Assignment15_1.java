package somnath;
public class Assignment15_1 {

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
		Assignment15_1 assignment15_1=new Assignment15_1();
		String[] a= {"Maulik","Techno","Nidhi","Ankit"};
		System.out.println("-------------------------------------------------");
		System.out.println("Difference of Even length and Odd Length is :>  "+assignment15_1.differenceOfEvenAndOddLength(a));
        System.out.println("-------------------------------------------------");
	}

}