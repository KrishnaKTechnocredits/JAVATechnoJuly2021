package varun.varun_different_programs;

public class PerfectSqaure {
	
	int perfectNum = 0;
	int givenNum = 0;
	void perfectSquareNum(int num) {
		givenNum = num;
		for (int i=1;i<num/2;i++) {
			if(i*i == num) {
				perfectNum = num;
			}
		}
		if(perfectNum == givenNum) 
			System.out.println(+num+ " is a perfect square Number");
		else
			System.out.println(+num+ " is not a perfect square");
	}
	
	
	public static void main(String[] args) {
		PerfectSqaure perfectSqaure =  new PerfectSqaure();
		perfectSqaure.perfectSquareNum(38);
		perfectSqaure.perfectSquareNum(49);
	}
}
