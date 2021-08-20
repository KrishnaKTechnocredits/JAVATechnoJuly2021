package nidhi;

class Nidhi_Assignment_13{
	
	int cntPositiveNumber(int arr[]){
		int cnt=0;
		for (int i=0; i < arr.length ; i++){
			if (arr[i] >= 0){
				cnt++;
			}
		}
		return cnt;
	}
	
	int cntZeros(int arr[]){
		int cnt=0;
		for (int i=0; i < arr.length ; i++){
			if (arr[i] == 0){
				cnt++;
			}
		}
		return cnt;
	}
	
	void fiveSmallerNumbers(int num){
		int[] myarray= new int[5];
		for (int i=0; i<5;i++){
			myarray[i] = num -(i+1);
			System.out.println(myarray[i]);
		}
	}
	
	public static void main(String[] args){
		Nidhi_Assignment_13 assignment13= new Nidhi_Assignment_13();
		int[] input1 = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println(assignment13.cntPositiveNumber(input1));
		int[] input2 ={1,-11,0,0,55,0,-23,0};
		System.out.println(assignment13.cntZeros(input2));
		assignment13.fiveSmallerNumbers(50);

	}
}