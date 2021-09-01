package laxman;

public class Test2608 {

		int digitSum(String str) {
			int sum=0;
			for(int index=0;index<str.length();index++) {
				if(Character.isDigit(str.charAt(index))){
					sum = sum + Character.getNumericValue(str.charAt(index));
				}
			}
			return sum;
			
		}
			void stringArray(String[]str) {
				int totalSum=0;
				int sum=0;
				for (int index=0;index<str.length;index++) {
					sum=digitSum(str[index]);
					totalSum=sum+totalSum;
				}
				System.out.println("Total Sum is "+ totalSum);
				
			}
		public static void main(String[] args) {
			Test2608 test2608 =new Test2608();
			String [] input= {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
			test2608.stringArray(input);
		
	}}


