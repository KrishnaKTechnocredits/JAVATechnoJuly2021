package chirag.assignment31;

public class FindPerfectNumberInArange {
	
	void isNumberPerfectInRange(int startNum,int endNum) {
		for(int num = startNum;num <= endNum;num++) {
			int sum = 1;
			for(int index = 2;index < num;index++) {
				if(num % index == 0)
					sum = sum + index;
			}
			if(sum == num)
				System.out.println("Perfect number in a given range : "+num);
		}
	}
	public static void main(String[] args) {
		FindPerfectNumberInArange perfectNumberInRange = new FindPerfectNumberInArange();
		perfectNumberInRange.isNumberPerfectInRange(1, 100);
	}

}
