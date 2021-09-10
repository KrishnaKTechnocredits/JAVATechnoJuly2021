package rushikesh.codetests;

public class Coding5 {
	boolean getPerfectNum(int num) {
		int number=num;
		int sum=0;
		for(int index=1;index<num;index++) {
			if(number%index==0) {
				sum+=index;
			}
		}
		if(num==sum)
			return true;
		else
			return false;
	}
	
	void findFirstPerfect(int num) {
	int count=0;
	int index1=1;
	System.out.println("First "+num+" perfect numbers are");
		while(count != num) {
		if(getPerfectNum(index1)) {
		count++;
		System.out.println(index1);
		}
			index1++;	
		}
	}
	public static void main(String[] args) {
		 Coding5 coding5=new Coding5();
		 coding5.findFirstPerfect(5);	
	}
}






