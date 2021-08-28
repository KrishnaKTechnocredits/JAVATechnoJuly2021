package shreya;

public class CodingTest1 {
	int getSumOfDigits(String[] str) {
		int sum=0;
		for(int index=0;index<str.length;index++) {
			String ch=str[index];
			for(int index1=0;index1<ch.length();index1++) {
				if(Character.isDigit(ch.charAt(index1))) {
				sum=sum+Integer.parseInt(ch.charAt(index1)+"");
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		CodingTest1 codingTest1=new CodingTest1();
		String[] str= {"t2e4c", "2h7no", "3h6h2h5", "1mk3", "k9g8"};// TODO Auto-generated method stub
		System.out.println("Sum Of all digits present in the array is "+codingTest1.getSumOfDigits(str));
	}
}
