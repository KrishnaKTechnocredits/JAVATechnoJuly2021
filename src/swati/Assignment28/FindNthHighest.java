/*
 * Assignment - 28 : 4th Sep'2021 

Program 1: Find second highest number from array.
int[] arr = {10,23,2,11,55,43,99};
output : 55

Program 2: Find nth highest number from array.
int[] arr = {10,23,2,11,55,43,99};
input n = 3;
output : 43
 */
package swati.Assignment28;

public class FindNthHighest {
	
	int returnNthHighest(int[] input,int num) {
		int index=1;
		int maxIndexValue=0;
		int max=0;
		while(index<=num) {
			max=input[0];
			for(int index2=1;index2<input.length;index2++) {
				if(max<input[index2]) {
					max=input[index2];
					maxIndexValue=index2;
				}
			}
			input[maxIndexValue]=0;
			index++;
			
		}
		 
		//System.out.println(num+"th Highest Number is:"+ max);
		return max;
		
	}
	
	public static void main(String[] a) {
		FindNthHighest findNthHighest =new FindNthHighest();
		int[] input={10,23,2,11,55,43,99};
		int nthNum=2;
		System.out.println(nthNum+"nd Highest Number is:"+ findNthHighest.returnNthHighest(input,nthNum));
		int[] input2={10,23,2,11,55,43,99};
		nthNum=3;
		System.out.println(nthNum+"rd Highest Number is:"+ findNthHighest.returnNthHighest(input2,nthNum));
	}

}
