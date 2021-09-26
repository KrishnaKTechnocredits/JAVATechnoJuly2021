package anuja;

public class Test1 {

	int display(String[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				char ch=arr[i].charAt(j);
				if(Character.isDigit(ch)) {
					int num= Character.getNumericValue(ch);
					sum=sum+num;
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Test1 test1=new Test1();
		String[] input = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		System.out.println("Sum of digits in a string array is "+test1.display(input));
	}
}
