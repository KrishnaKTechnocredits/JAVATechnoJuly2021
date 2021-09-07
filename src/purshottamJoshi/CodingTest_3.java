package purshottamJoshi;

class CodingTest_3{
	void removeElementFromArray(int[] arr,int num){
		System.out.println("After Removing "+num+" from array");
		for(int index=0; index < arr.length; index++){
			if(arr[index] == num)
				index++;
				System.out.println(arr[index]);
		}
	}
		
	
	public static void main(String[] args){
		int input[] = {25,14,56,15,36,56,77,18,29,49};
		CodingTest_3 codingtest_3 = new CodingTest_3();
		codingtest_3.removeElementFromArray(input,14);
		
	}
}