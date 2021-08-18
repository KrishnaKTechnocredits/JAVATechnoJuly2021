package nasir;

public class CountNumberOfZero {
	int countZero(int[] num) {
		int count=0;
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;
		}
		return count;
	}
	

	public static void main(String[] args) {
		int[] input = {1,-11,0,0,55,0,-23,0};
		CountNumberOfZero countNumberOfZero = new CountNumberOfZero();
		System.out.println(countNumberOfZero.countZero(input));
		

	}

}
