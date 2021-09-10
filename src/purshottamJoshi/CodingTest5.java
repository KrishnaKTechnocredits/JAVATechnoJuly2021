package purshottamJoshi;

class CodingTest5{
	
	int count=0;
	void isPerfectNumber(long input){
		int sum=0;
		for(int index=1; index<input; index++){
			if(input% index ==0){
				sum=sum+index;
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
			isPerfectNumber(index);
			index++;
		}
	}
	
	public static void main(String[] args){
		CodingTest5 codingTest5=new CodingTest5();
		codingTest5.getPerfectNum(5);
	}
}
