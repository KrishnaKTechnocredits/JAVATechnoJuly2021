package sourabh;

public class Assignment_14 {

	static int maxnum =0;
	int getMaxNum(int[]  num) {
		for (int index=0; index<num.length; index++) {
			if (num[index]>maxnum) {
				maxnum = num[index];
			}
		}
		return maxnum;
	}

	int getMinNum(int[]  num) {
		int minnum = num[0];
		for (int index=0; index<num.length; index++) {
			if (num[index]<minnum) {
				minnum = num[index];
			}
		}
		return minnum;
	}

	int getMaxMinDiff(int[] num) {
		int min  = num[0];
		int max =0;
		for (int index=0; index<num.length; index++) {
			if (num[index]<min)
				min =num[index];
			if (num[index]>max)
				max = num[index];
		}
		return max - min;
	}

	int getMaxEvenOddDiff(int[] num) {
		int evenmax =0;
		int oddmax = 0;
		for (int index=0; index<num.length; index++) {
			if (num[index]%2==0) {
				if(num[index]>evenmax)
					evenmax = num[index];	
			}
			else if (num[index]> oddmax)
				oddmax = num[index];
		}
		if (oddmax - evenmax>0)
			return oddmax - evenmax;
		else
			return evenmax - oddmax;			
	}

	public static void main(String[] args) {
		int[] input= {1,11,44,23,55,99,23};
		Assignment_14 assignment14 = new Assignment_14();

		assignment14.getMaxNum(input);
		System.out.println("Max number is: " + maxnum);

		assignment14.getMinNum(input);
		System.out.println("Min number is: " + assignment14.getMinNum(input));

		assignment14.getMaxMinDiff(input);
		System.out.println("Difference between Mix and Min is: " + assignment14.getMaxMinDiff(input));

		assignment14.getMaxEvenOddDiff(input);
		System.out.println("Difference between Mix even and odd is: " + assignment14.getMaxEvenOddDiff(input));	

	}
}
