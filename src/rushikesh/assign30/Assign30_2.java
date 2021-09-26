package rushikesh.assign30;

public class Assign30_2 {
	int temp,total=0;
	void  checkArmstrongNum(int num) {
		int numBer=num;
		while(numBer!=0) {
			temp=numBer%10;
			total=total+temp*temp*temp;
			numBer=numBer/10;
		}
		if(total==num) 
			System.out.println(num+" is an Armstrong number");
		else
			System.out.println(num+" is not an Armstrong number");
	}
	
	public static void main(String[] args) {
		Assign30_2 assign30_2=new Assign30_2();
		assign30_2.checkArmstrongNum(371);
	}
	
	
	
}
