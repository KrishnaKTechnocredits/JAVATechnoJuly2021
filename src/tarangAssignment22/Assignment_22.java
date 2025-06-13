package tarangAssignment22;

public class Assignment_22 {
	
		int cnt = 0;
		int sum=0;
		
		int getDigitcount(String input) {

			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch))
				{
					cnt++;
				}
			}
			return cnt;
		}
		
		int getSumDigits(String input) {

			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					int num= Character.getNumericValue(ch);
					sum=sum+num;
				}
			}
			return sum;
		}
			public static void main(String[] args)
			{
				String str = "Te1ch2no3cr4ed3it4s";
				System.out.println("The count of digits in string is " + new Assignment_22().getDigitcount(str));
				System.out.println("The sum of digits in string is " + new Assignment_22().getSumDigits(str));
				
			}

		}



