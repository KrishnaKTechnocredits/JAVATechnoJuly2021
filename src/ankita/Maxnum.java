package ankita;

public class Maxnum {
	
	static int max=0;
	int getMaxnum(int[]num) {
		for(int index=0;index<num.length;index++) {
			if(num[index]>max)
				max=num[index];
		}
		
		return max;
	}	
	
	public static void main(String[] args) {
		int[] number= {1,11,44,23,55,99,23};
		Maxnum maxnum= new Maxnum();
		maxnum.getMaxnum(number);
		System.out.println("max no is " + max);
		
	}
}
