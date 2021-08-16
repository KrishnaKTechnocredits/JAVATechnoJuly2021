package rushikesh.assignment13;

public class FiveSmallNum {
	int[] getNumbers(int givenNum,int howManySmall) {
		int[] output=new int[howManySmall];
		for(int index=0;index<howManySmall;index++) {
			givenNum--;
			output[index] = givenNum;
		}
		return output;
	}
	public static void main(String[] args) {
		FiveSmallNum fiveSmallerNum=new FiveSmallNum();
		int arr[] = fiveSmallerNum.getNumbers(50,5);
		for(int i=0; i<5;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}