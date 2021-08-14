package prajwal;

public class Assignment_10 {
	int primenumbercount;
	int sum=0;
	int avg;
	
	void primeNumber(int number) {
		boolean status=true;
		for(int index=2; index<number; index++)
		if(number % index==0) {
		status=false;
		//System.out.println(number +"number is not a prime number");
		break;
	}
	if(status)
	{
		System.out.println(number +" :number is a prime number");
		if(number>=101 && number<=120) {
		primenumbercount++;
		sum=sum+number;
		avg=sum/primenumbercount;
	}
}
}
	
	void allPrimeNumber(int startnumber , int endnumber)
	{
		for(int number=startnumber;number<=endnumber;number++)
		primeNumber(number);
		System.out.println("count of prime number: " +primenumbercount);
	}

	void sumofallprimenumbers()
	{
		System.out.println("count of prime number" +sum);
	}
	
	void displayAverageofPrimenumber()
	{
		System.out.println("Average of prime Numbers is " +avg );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_10 assignment10= new Assignment_10 ();
		assignment10.primeNumber(3);
		assignment10.allPrimeNumber(100 , 120);
		assignment10.sumofallprimenumbers();
		assignment10.displayAverageofPrimenumber();
}

}
