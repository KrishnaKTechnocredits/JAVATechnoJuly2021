package rasika_test5;

public class getFirstFivePerfectNumbers {
	
	void getFirstFivePerfectNumbers(int count) {
		int index = 1;
		int cnt = 0;
		while (cnt != 5) {
			if (isPerfectNumber(index)) {
				System.out.println("Perfect Number : " + index);
				cnt++;
			}
			index++;
		}
	}
	boolean isPerfectNumber(int num) {
		int div =0;
		for(int i = 1; i < num; i++) {
			if(num%i == 0) {
				div=div+i;
			}
		}
		if(num==div) {
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		getFirstFivePerfectNumbers pgm = new getFirstFivePerfectNumbers();
		pgm.getFirstFivePerfectNumbers(5);
		
}
}
