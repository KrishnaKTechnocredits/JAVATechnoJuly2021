package rushikesh.assign31;

public class Assign31_3 {
	void checkPerfectsq(int num) {
		int number=num;
		int sqrt=(int) Math.sqrt(num);
		if(number==sqrt*sqrt) 
			System.out.println(number+" is a perfect square");
		else
			System.out.println(number+" is not a perfect square");
	}

	public static void main(String[] args) {
		Assign31_3 assign31_3=new Assign31_3();
		assign31_3.checkPerfectsq(5);
	}
}
