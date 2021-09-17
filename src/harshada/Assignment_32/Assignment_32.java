/* Assignment - 32 : 10th Sep'2021
 
Program 1: find the triple which in sequence and having maximum sum.
int[] arr = {10,64,65,66,23,24,25,26,61,62};
output : 64,65,66 is a triple having maximum sum
Note : 23,24,25             	   24,25,26                      	64,65,66 -> having max sum
*/

package harshada.Assignment_32;

public class Assignment_32 {
	
	void getTriplets(int arr[]) {
		int num1=0,num2=0,num3=0,count=0,sum=0,maxSum=0;
		for(int index=0; index< (arr.length)- 2; index++) {
			num1=arr[index];
			num2=arr[index+1];
			num3=arr[index+2];
			
			if(num2==num1+1 && num3==num2+1) {
				count++;
				sum=num1+num2+num3;
			}
			
			if(sum>maxSum) {
				maxSum=sum;
				System.out.println("Triplet Numbers are : ");
				System.out.println("NUMBER 1= " +num1);
				System.out.println("NUMBER 2= " +num2);
				System.out.println("NUMBER 3= " +num3);
			}
		}
		
		System.out.println("Maximum Sum= "+ maxSum);
		System.out.println("Total triplet count is = "+ count);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_32 p1=new Assignment_32();
		int[] arr = {10,64,65,66,23,24,25,26,61,62};
		p1.getTriplets(arr);
	}

}
