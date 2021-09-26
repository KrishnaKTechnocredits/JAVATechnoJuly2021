package shreya_assignment_30_numberpallindrome;

public class ReverseNumber {
	int reverse=0;
	int num=1932;
	
	void getReverseNumber() {
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
			
			}
		System.out.println("Reverse of a number: "+reverse);
		}
	
	public static void main(String[] args) {
		ReverseNumber reverseNumber=new ReverseNumber();
		reverseNumber.getReverseNumber();
	}

}
