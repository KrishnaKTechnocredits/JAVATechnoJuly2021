
package prerana;

public class Assignment11 {
	int count = 0;
	boolean primeNumberStatus(int n) {
		boolean status=true;
		int index=2;
		while(index<n) {

			if(n%index==0) {
				status = false;
				break;	
			}

			index++;
		}
		return status;
	}

	void requiredNumbers(int requiredCount) {
		int num = 2;
		System.out.print(" Prime Numbers are:" + requiredCount  );
		while (count < requiredCount) {
			if(primeNumberStatus(num)) {
				System.out.print(num+ " ");
			count++;
			}
			num++;
		}
	}

	void requiredNumbersCreateToSum(int requiredSum, int startIndex) {
		int sum=0;
		int num=0;
		while(sum<=requiredSum) {
			sum=sum+startIndex;
			num++;
			startIndex++;
		}
		System.out.println("Required "+num+ " sum "+requiredSum);
	}
	



	public static void main(String[] args) {
		Assignment11 a=new Assignment11();
		a.requiredNumbers(10);
		a.requiredNumbersCreateToSum(100,1);



	}


}





