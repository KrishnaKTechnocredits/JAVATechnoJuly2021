package rushikesh.assign30;

public class Assign30_5 {
	static int numBer;
	boolean getPerfectSquare(int num) {
		numBer=num;
		int quotient;
		for(int index=1;index<=num;index++) {
			quotient=numBer/index;
			if(numBer%index==0 && quotient==index)
				return true;
		}
		return false;	
	}
	public static void main(String[] args) {
		Assign30_5 assign30_5=new Assign30_5();
		boolean Num=assign30_5.getPerfectSquare(16);
		if(Num)
			System.out.println(numBer+" is a perfect square");
		else
			System.out.println(numBer+" is not a perfect square");
			
	}
}

//quotient and divisor must be same