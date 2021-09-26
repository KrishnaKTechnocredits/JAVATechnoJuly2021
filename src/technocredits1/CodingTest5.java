package technocredits1;
/*
 * 
 */
class CodingTest5{
	
	int count=0;
	void isPerfectNumber(long input){
		int sum=0;
		for(int num=1;num<=input/2;num++){
			if(input%num==0){
				sum=sum+num;
			}
		}
		if(input==sum){
			count++;
			System.out.println(input + " is a perfect number");
		}
	}
	
	void getPerfectNum(int n){
		long index=1;
		while(count<=n){
			if(index == 33550336) {
				System.out.println("Hi");
			}
			isPerfectNumber(index);
			index++;
			
		}
		
	}
	
	public static void main(String[] args){
		CodingTest5 codingTest5=new CodingTest5();
		codingTest5.getPerfectNum(5);
	}
}
