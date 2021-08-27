package monika;

public class Scoding_test {
	
	int getsumofAlldigits(String input) {
		int sum=0;
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				sum+=Character.getNumericValue(input.charAt(index));
		}
		return sum;
	}
	
	int getSumOfallDigitsinArray(String[] input) {
		int ans=0;
		for(int index=0; index<input.length;index++) 
			ans+=getsumofAlldigits(input[index]);
		return ans;
			
	}
	
	public static void main(String[] args) {
		String[] array = {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};
		Scoding_test scoding_test=new Scoding_test();
		System.out.println("The total sum = "+scoding_test.getSumOfallDigitsinArray(array));
		
	}
}

