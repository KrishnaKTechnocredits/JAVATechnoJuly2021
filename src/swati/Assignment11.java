package swati;
class Assignment11{
	int count;	
	void verfiyNumberIsPrime(int number){
		boolean status=true;
		int index=2;
		while(index<number){
			if(number%index==0){
			status=false;
			break;
			}
			index++;
		}
		
			if(status==true){
			System.out.println(index);
			count++;
			}
	}
		
	void printFirstNPrimeNumbers(int range){
		int number=2;
		while(count<range){
			verfiyNumberIsPrime(number);
			number++;
		}
	}
	
	void findRequiredNoSum100(int range){
		int number=1;
		int sum=0;
		int count=0;
		while(sum<range){
			sum=sum+number;
			number++;
			count++;
		}
		System.out.println("\nRequired numbers to generate sum more than 100: "+count);
	}
								
	public static void main (String[] a){
		Assignment11 assignment11=new Assignment11();
		assignment11.printFirstNPrimeNumbers(10);
		assignment11.findRequiredNoSum100(100);
	}
}
		