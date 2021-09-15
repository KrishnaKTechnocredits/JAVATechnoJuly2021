package rushikesh.assign31;

public class Assign31_2 {

	void getPerfectNum(int num) {
		int number=num;
		int sum=0;
		for(int index=1;index<num;index++) {
			if(number%index==0) {
				sum+=index;
			}
		}
		if(num==sum)
			System.out.println(num+" is a perfect number");
		else
			System.out.println(num+" is not a perfect number");
	}
	
	void inRangePerfectNum(int startInd,int endInd) {
		for(int index=startInd;index<=endInd;index++) {
			getPerfectNum(index);
		}
	}
	
	public static void main(String[] args) {
		Assign31_2 assign31_2=new Assign31_2() ;
		assign31_2.inRangePerfectNum(6, 30);
	}
}


