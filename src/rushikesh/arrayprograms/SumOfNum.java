package rushikesh.arrayprograms;

public class SumOfNum {
	int getSum(String input) {
		int sum=0;
		String [] arr= input.split(" ");
		int[] num=new int[arr.length];
		for(int index=0;index<arr.length;index++) {
			num[index]=Integer.parseInt(arr[index]);
			sum+=num[index];
		}
		return sum;
	}
	public static void main(String[] args) {
		SumOfNum sumOfNum=new SumOfNum();
		String input = "10 10 20 30";
		int sum=sumOfNum.getSum(input);
		System.out.println("Sum of numbers in given statement is "+sum);
	}
}



