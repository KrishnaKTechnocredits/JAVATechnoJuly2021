package precilla.test;
import java.util.Arrays;

public class TestProgram {
	int getSumOfstring(String[] str) {
		int output=0;
		for(int index=0;index<str.length;index++)
		{
			String values=str[index];
			for(int index1=0;index1<values.length();index1++) {
				char ch=values.charAt(index1);
				if(Character.isDigit(ch)) {
					int temp=Character.getNumericValue(ch);
					output+=temp;
				}
			}
		}
		return output;
	}
	public static void main(String[] args) {
		TestProgram testProgram=new TestProgram();
		String input[]= {"t2e4c","2h7no","3h6h2h5","1mk3","k9g8"};
		System.out.print("Given Array of String : "+Arrays.toString(input));
		System.out.println("\nSum of All the digit available in the string : " + testProgram.getSumOfstring(input));
		
	}

}
