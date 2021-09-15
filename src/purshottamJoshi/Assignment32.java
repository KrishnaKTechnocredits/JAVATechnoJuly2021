/*Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25
       24,25,26
	   64,65,66 -> having max sum*/
package purshottamJoshi;
class Assignment32{
	
	int maxSum=0;
	int finalMaxSum=0;
	void getTripletCount(int[] input){
		
		for(int index=0; index < input.length-2; index++) {
			int number = input[index];
			int differenceIndex = input[index+1]-input[index]; 
			if(differenceIndex == 1) {
				if(number < input[index+1]) {
					maxSum=number + input[index+1]+ input[index+2];
					if(maxSum >finalMaxSum) {
						finalMaxSum=number + input[index+1]+ input[index+2];
						System.out.println(number+","+input[index+1]+","+input[index+2]+" is triplet having max sum "+finalMaxSum);
					}
				}
				
			}
		}
	}


	public static void main(String[] args){
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		Assignment32 assignment32 = new Assignment32();
		assignment32.getTripletCount(arr);
	}

}