package indrani;


public class Assignment_11 {

      boolean isPrime(int number){
	     boolean flag = true;
		 int index=2;
		 for( ;index < number; index++){
		   if(number % index == 0){
		        flag=false;
				break;
				}
				}
				return flag;
				}
				
		void requiredCountPrime(int reqCount){
			int count=0;
			int number=2;
			System.out.println("First " + reqCount + "prime numbers are: ");
			while(count < reqCount){
			if(isPrime(number)){
			System.out.print(number + " ");
			count++;
				}
				number++;
				}
				}
		 void reqNumberForGeneratingSum(int reqSum){
              int sum=0;
              int number=1;
              while(sum < reqSum){
              sum=sum+number;
              number ++;
		      }
			  System.out.println(" Required number for generating Sum greater than " + reqSum + " is : " +(number-1));
			}
					 
		public static void main(String[] args){
			 Assignment_11 assignment_11 = new Assignment_11();
			 assignment_11.requiredCountPrime(20);
			 System.out.println();
			 assignment_11.reqNumberForGeneratingSum(100);
			}
	}
					 
					 
					 
					
		 