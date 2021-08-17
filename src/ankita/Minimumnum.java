package ankita;

public class Minimumnum {
	
	int getMinnum(int[]num) {
	int min=num[0];
	for (int index=0;index<num.length;++index) {
		if(num[index]<min)
			min=num[index];
	}
	return min;
}	
	public static void main(String[] args) {
		int[] number= {1,11,44,23,55,99,23};
		Minimumnum minimum= new Minimumnum();
		System.out.println("min no is "+ minimum.getMinnum(number));
	}
	

}
