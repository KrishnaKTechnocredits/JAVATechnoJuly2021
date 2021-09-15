/*Test 5 :
Find first 5 perfect numbers.*/
package elizabeth;
class CodingTest5{
	
	int count=0;
	void isPerfectNumber(long input){
		int sum=0;
		for(int num=1;num<input;num++){
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
			isPerfectNumber(index);
			index++;
		}
	}
	
	public static void main(String[] args){
		CodingTest5 codingTest5=new CodingTest5();
		codingTest5.getPerfectNum(5);
	}
}
