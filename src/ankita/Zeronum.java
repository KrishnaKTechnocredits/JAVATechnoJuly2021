package ankita;

public class Zeronum {
	static int count=0;
	int getZeronum(int[]num) {
		
		for(int index=0;index<num.length;index++) {
			if(num[index]==0)
				count++;	
		}
		return count;
	}
	public static void main(String[] args) {
		int[] number= {1,-11,0,0,55,0,-23,0};
		Zeronum zeronum=new Zeronum();
		zeronum.getZeronum(number);
		System.out.println("zeros are " + count);
		
		
	}
}
