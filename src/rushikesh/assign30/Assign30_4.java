package rushikesh.assign30;

public class Assign30_4 {
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
	
	
	public static void main(String[] args) {
		Assign30_4 assign30_4=new Assign30_4();
		assign30_4.getPerfectNum(496);
	}
}
