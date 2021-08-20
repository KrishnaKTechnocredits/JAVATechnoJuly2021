package elizabeth;

class Assignment11{

	void primeCount(int n){
		int count=0;
		int num=2;
		System.out.println("Prime Numbers are as below:");
		while(count!=n){
			boolean flag=true;
			int index=2;
			while(index<num){
				if(num%index==0){
					flag=false;
					break;
					}	
			index++;
			}
			if(flag){
				System.out.println(num);
				count++;
			}
		num++;	
		}
	}
		
	void findNumbersForSum(int n){
		int count=0;
		int sum=0;
		int num=1;
		while(sum<n){
			sum=sum+num;
			num++;
			count++;
		}
		System.out.println("Required number count is " +count);
	}
	
	public static void main(String[] args){
		Assignment11 assignment11=new Assignment11();
		assignment11.primeCount(15);
		assignment11.findNumbersForSum(100);
		
	}
}