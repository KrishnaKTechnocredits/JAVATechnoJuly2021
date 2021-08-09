package prajwal;

public class Assignment_7 {
	
	void evenNumbers() {
	for(int evenNumber=10; evenNumber<=15; evenNumber++)
	if (evenNumber % 2==0)
	{
		System.out.println("Even numbers are " +evenNumber);
	}
}
	
	void divisibleBy5() {
	for(int number=10; number<=30; number++)
	if (number % 5==0)
	{
		System.out.println("Numbers divisible by 5 are " +number);
	}
}
	
	void divisibleBy5and3() {
	for(int number=5; number<=18; number++)
	if(number % 5==0 && number%3==0)
	{
		System.out.println("Divisible by 5 & 3: "+number);
	}
}
	
	void dibisibleBy7or13() {
	for(int number=5; number<=40; number++)
	if(number % 7==0)
	{
		System.out.println("Numbers Divisible by 7: "+number);
	}
	else if(number % 13==0) 
	{
		System.out.println("Numbers Divisible by 13:"+number);
	}
}
	
	void sumofallnumbers() {
	int sum=0;
	for(int number = 1; number<=5;number++)
	{   
		sum= sum+ number;
	}
	System.out.println("Sum of all the numbers is " +sum);
	}

	void differenceBetweensumofoddandevennumbers() {
	int sum1=0;
	int sum2=0;
	int difference;
	for(int number=3; number<=9;number++ )
	if(number %2 !=0)
	{
		sum1=number+sum1;
	}
	else
	{
		sum2=number+sum2;
	 }
	difference=sum1 - sum2 ;
	System.out.println("Difference between sum of odd numbers & even numbers is: "+difference);
	}
	
	void oddnumbersreverseorder() {
	for(int number=20; number>=10; number--)
	if(number %2 !=0)
	{
		System.out.println("Odd numbers in reverse order are: "+number);
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Assignment_7 assignment7= new Assignment_7();
      assignment7.evenNumbers();
      assignment7.divisibleBy5();
      assignment7.divisibleBy5and3();
      assignment7.dibisibleBy7or13();
      assignment7.sumofallnumbers();
      assignment7.differenceBetweensumofoddandevennumbers();
      assignment7.oddnumbersreverseorder();
	}

}
