/*Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43*/

package elizabeth;
class Assignment28{
	
	int getSecondHighestNum(int[] arr){
		int max=0;
		int secondMax=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]>max){
				secondMax=max;
				max=arr[index];
			}else if(arr[index]>secondMax){
				secondMax=arr[index];
			}
		}
		return secondMax;
	}
	
	int setMaxZero(int[] arr){
		int max=0;
		int maxIndex=0;
		for(int index=0;index<arr.length;index++){
			if(arr[index]>max){
				max=arr[index];
				maxIndex=index;
			}
		}
		arr[maxIndex]=0;
		return max;
	}
	
	int getnthHighestNum(int[] arr,int n){
		int nthMax=0;
		for(int index=0;index<n;index++){
			nthMax=setMaxZero(arr);
		}
		return nthMax;
	}
	
	public static void main(String[] args){
		Assignment28 assignment28=new Assignment28();
		int[] arr = {10,23,2,11,55,43,99};
		System.out.println("Second Highest number is " +assignment28.getSecondHighestNum(arr));
		System.out.println("nth Highest number is " +assignment28.getnthHighestNum(arr,3));
		
	}
}