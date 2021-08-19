package deven_dc.assign;

public class Assignment13_P1 {

	int countOfPositiveNumbers(int[] number) {
		int count = 0;
		int num[]=number;
		for(int index=0; index < num.length; index++){
			if(num[index] > 0)
				count++;
		}
		return(count);
	}

	public static void main(String[] args) {
		Assignment13_P1 a13_p1 = new Assignment13_P1();
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		System.out.println("\n Count of Positive Numbers in the Given Range :: " + a13_p1.countOfPositiveNumbers(input));
	}
}