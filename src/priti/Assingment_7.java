package priti;

class Assingment_7{
	
	void PrEvenNumber(){
		for(int num=10;num<=15;num++){
			if (num%2==0){
				System.out.println(num +" Number is even");
			}
		}
	}
	
	void PrNumDivBy5(){
		System.out.println("----------------------------------------------");
		for(int num=10;num<=30;num++){
			if (num%5==0){
				System.out.println(num+" Number is Divisible by 5");
			}
		}
		
	}
	
	void PrNumDivBy5and3(int startIndex, int endIndex ){
		System.out.println("----------------------------------------------");
		for (int num= startIndex;num<=endIndex;num++){
			if (num%3==0&& num%5==0){
				System.out.println(num+" Numner is Divisible by 3 &5");
			}else if (num%3==0){
				System.out.println(num+" Numner is Divisible by 3");
			}else if (num%5==0){
				System.out.println(num+" Numner is Divisible by 5");
			}
		}
	}
	
	void PrNumDivBy7Or13(int startIndex, int endIndex ){
		System.out.println("----------------------------------------------");
		System.out.println("Numbers divisble by 7 or 13 are");
		for (int num= startIndex;num<=endIndex;num++){
			if (num%7==0){
				System.out.println(num+" Numner is Divisible by 7");
			}else if (num%13==0){
				System.out.println(num+" Numner is Divisible by 13");
			}
		}	
	}
	
	void FindSum(){
		System.out.println("----------------------------------------------");
		int sum=0;
		for (int index=1;index<=5;index++){
			sum=sum+index;
		}
		System.out.println("sum is " +sum);
	}
	
	void FindDiffBetSumOddNumandEvenNum (){
		System.out.println("----------------------------------------------");
		int oddSum =0;
		int evenSum=0;
		int diff;
		for(int index=3;index<=9;index++){
			if (index%2!=0){
				oddSum = oddSum+index;
			}else if (index%2==0){
				evenSum = evenSum+index;
			}
		}
		diff= oddSum-evenSum;
		System.out.println("Difference of Odd and Even numners is " + diff);
	}
	
	void PrOddNumReverseOr(){
		System.out.println("----------------------------------------------");
		for (int index=20;index>=10;index--){
			if (index%2!=0){
				System.out.println("Number is " +index);
			}
		}
	}
		
	public static void main(String[]a){
	Assingment_7 assingment_7 = new Assingment_7();
	assingment_7.PrEvenNumber();
	assingment_7.PrNumDivBy5();
	assingment_7.PrNumDivBy5and3(5,18);
	assingment_7.PrNumDivBy7Or13(5,40);
	assingment_7.FindSum ();
	assingment_7.FindDiffBetSumOddNumandEvenNum();
	assingment_7.PrOddNumReverseOr();
	}
}	