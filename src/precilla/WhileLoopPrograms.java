package precilla;
//n numbers so,


public class WhileLoopPrograms {
	int sum=0;
	int count=0;
	//int primenumbers=0;
	
	void printFirstNNumbers(int number) {
		int nextNum=1;
		int divisor = 1,counter = 0,loopCount=1;
		
		while(loopCount<=number) {
			divisor=1;
			counter=0;
			while(divisor<=nextNum) {
				if(nextNum%divisor==0) {
					counter++;
				}
				divisor++;
			}
			if(counter==2) {
				System.out.print(nextNum + " ");
				loopCount++;
				
			}
			nextNum++;
		}
	}
	void requiredNumberToGenerateSum() {
		int index=1;
		while(sum<=100) {
			sum=sum+index;
			index++;
			count=count+1;		
			}	
		System.out.println("\nNumbers required to generate sum more than 100 : "+count);
		
	}
	public static void main(String[] args) {
		WhileLoopPrograms whileLoopProgarms=new WhileLoopPrograms();
		System.out.println("First N Prime Numbers are: ");
		whileLoopProgarms.printFirstNNumbers(10);
		whileLoopProgarms.requiredNumberToGenerateSum();

	}

}
