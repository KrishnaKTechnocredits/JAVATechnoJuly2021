package technocredits1;

public class PritiDouble {

	public static void main(String[] args) {
		int sum = 10;
		char ch = '1';
		int num = ch - 48;
		sum += num;
		if(Character.isDigit(ch)) {
		String str = ch + "";
		System.out.println(str); // true
		int temp = Integer.parseInt(str);
		sum = sum + temp;
		System.out.println(sum);
		}
	}
}
