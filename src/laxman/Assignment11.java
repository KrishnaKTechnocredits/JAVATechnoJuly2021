package laxman;



public class Assignment11{

	void printPrimeNumber(int num)
	{
		System.out.println("First " + num + " prime numbers are : ");

		int count= 0;
		int number = 2;

		while(count < num)
		{
			boolean flag=true;
			int index = 2;
			while(index < number )
			{
				if(number % index == 0)
				{
					flag = false;
					break;
				}

				index++;
			}
			if(flag)
			{
				System.out.println(index);
				count++;
			}
			number++;			
		}	
	}

	void generateSum() {
		int sum = 0;
		int number = 0;

		while (sum <= 100) {
			sum = sum + number;
			if (sum <= 100) {
				number++;
			}

		}
		System.out.println("----------------------------------------");
		System.out.println("Numbers to sum more than 100 :- " + "\n" + number);
	}

	public static void main(String[] args) {
		Assignment11 assignment11 = new Assignment11();
		assignment11.printPrimeNumber(10);
		assignment11.generateSum();
	}
}