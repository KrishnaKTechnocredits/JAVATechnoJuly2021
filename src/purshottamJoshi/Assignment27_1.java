package purshottamJoshi;

class Assignment27_1{
	int count;
	void checkIdenticalArray(int[] input1, int[] input2) {
		for(int index=0; index < input1.length; index++) {
			for(int innerindex=0; innerindex < input2.length; innerindex++)
				if(input1[index] == input2[innerindex])
					count++;
	
		}
		if(count == input1.length && count == input2.length) {
			System.out.println("identical array");
		}else {
			System.out.println("Not identical arrays");
		}
	}
	
	public static void main(String[] args){
		int[] arr1 = {10,12,55,32,17};
		int[] arr2 = {10,12,55,32,17,20};
		int[] arr3 = {10,12,55,32,17};
		Assignment27_1 assignment27_1 = new Assignment27_1();
		Assignment27_1 assignment27_1_2 = new Assignment27_1();
		assignment27_1.checkIdenticalArray(arr1,arr2);
		assignment27_1_2.checkIdenticalArray(arr1,arr3);
		
	}
}