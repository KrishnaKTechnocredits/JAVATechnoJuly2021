package nidhi;

class Nidhi_Assignment_11{
	
	void firstNPrime(int primecnt){
		int prcnt = 0;
		int num = 1;
		System.out.println("First " + primecnt + " Prime Numbers");
		while (prcnt < primecnt){
			boolean status = true;
			for (int ind = 2; ind < num; ind++ ) {
				if (num % ind == 0) {
					status = false;
					break;
				}
			}
			
			if(status) {
				System.out.println(num);
				prcnt++;
			}
			num++;
		} 
	}
	
	void sumNumbers(int totalSum){
		int sum = 0;
		int num = 1;
		int cntnum=0;
		do{
			sum = sum + num;
			num++;
			cntnum++;
		}while(sum < totalSum);
		System.out.println("Total numbers needed for sum of " + totalSum + " is " + cntnum);
		
	}
	
	public static void main(String[] arg){
		Nidhi_Assignment_11 assignment11= new Nidhi_Assignment_11();
		assignment11.firstNPrime(5);
		assignment11.sumNumbers(100);
	}
}