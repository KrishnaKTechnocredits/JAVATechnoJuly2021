package margi;

class Assignment_11_1{
	
	//first prime numbers
	void firstPrime(int primeCnt){
		int count = 1, num = 2;
		
		System.out.println("First " + primeCnt + " prime numbers are: ");
		while(count <= primeCnt){
			boolean flag = true;
			int index=2;
			while(index < num){
				if(num % index == 0){
					flag = false;
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
	
	public static void main(String[] args){
		Assignment_11_1 prime = new Assignment_11_1();
		prime.firstPrime(10);
	}
}