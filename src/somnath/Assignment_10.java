package somnath;
public class Assignment_10{
	int countPrimeNumbers;
	int sumOfPrimeNumbers;
	double averageOfAllPrimeNumbers;
	
		void verifyNumbersIsPrime(int number){
			boolean status = true;
			if(number > 0){
				for(int index=2; index < number-1; index++){
					if(number% index == 0){
						System.out.println("Number is not prime number:" + number);
						status = false;
							
						break;
						}
					}

		if(status){
					System.out.println("Number is prime number:" +number);
					countPrimeNumbers++;
					sumOfPrimeNumbers = sumOfPrimeNumbers + number;
					averageOfAllPrimeNumbers = sumOfPrimeNumbers / +countPrimeNumbers;
					}
				}
					
					else if (number ==0)
						System.out.println("Number is real number :" +number);
						
						else
						
						System.out.println(
						"Entered number: " + number + " is not a positve number, please enter number greater than 0 ");
						}
						void findPrimeNumberInGivenRangeInput(int startNumber, int endNumber){
							for(; startNumber<= endNumber; startNumber++){
								verifyNumbersIsPrime(startNumber);
								}
								
						System.out.println("Count of prime numbers :" +countPrimeNumbers);
						System.out.println("Sum of all prime numbers :" +sumOfPrimeNumbers);
						System.out.println("Average of all prime numbers :" + averageOfAllPrimeNumbers);
						}
						
						public static void main (String[] args){
							Assignment_10 A_10  = new Assignment_10();
							System.out.println("----------Output of call of verifyNumberIsPrime() three times------");
							A_10.verifyNumbersIsPrime(-1);
							A_10.verifyNumbersIsPrime(0);
							A_10.verifyNumbersIsPrime(11);
							System.out.println("-------------Output of call of findPrimeNumberInGivenRangeInput() one time----");
							A_10.findPrimeNumberInGivenRangeInput(100,107);
							}
						}	
							