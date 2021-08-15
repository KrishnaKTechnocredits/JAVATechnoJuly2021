/*Assignment 13 : 15th Aug'2021

program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3*/



package ritabrata;

public class PositiveNo {
	int displayPossitive(int[] input) {
		int count=0;
		for(int number=0; number<input.length; number++) {
			if(input[number]>0) {
				count++;
			}
		}
		System.out.println("The total no if positive integer is: "+count);
		return count;
	}

	public static void main(String[] args) {
		PositiveNo positiveNo=new PositiveNo();
		int[] arr= new int[8];
		arr[0]=1;
		arr[1]=-11;
		arr[2]=-44;
		arr[3]=23;
		arr[4]=55;
		arr[5]=-99;
		arr[6]=-23;
		arr[7]=-22;
		positiveNo.displayPossitive(arr);
		
		
		

	}

}
