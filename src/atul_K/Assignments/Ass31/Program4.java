package atul_K.Assignments.Ass31;

public class Program4 {
	void isPerfect(int sNum, int eNum) {
		for (int outerindex= sNum;outerindex<= eNum;outerindex++) {
			int sum = 1;
			for (int index=2;index <= outerindex/2;index++) {
				if(outerindex%index ==0)
					sum += index;
			}
			if (outerindex == sum)
				System.out.println(outerindex+"  ");
		}
	}
	public static void main(String[] args) {
		int sNum= 4;
		int eNum = 500;
		Program4 p4 = new Program4();
		p4.isPerfect(sNum,eNum);
	}
}
