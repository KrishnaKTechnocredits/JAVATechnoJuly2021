/*program 1 : return count of positive numbers from given array.
int[] input = {1,-11,-44,23,55,-99,-23,-22};
output : 3*/
package nasir;

public class PositiveNumberCount {

	int getCountPositiveNumbers(int[] num ) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]>0)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		PositiveNumberCount positiveNumberCount= new PositiveNumberCount();
		System.out.println("Count of positive numbers from given array "+positiveNumberCount.getCountPositiveNumbers(input));
	}
}
