package rushikesh.assign26;

public class Assign26_4 {

	void getExchangeNum(int a,int b) {
		int val1=a;
		int val2=b;
		val1=val1+val2;
		val2=val1-val2;
		val1=val1-val2;
		System.out.println(val1+" "+val2);
		
	}
	public static void main(String[] args) {
		Assign26_4 assign26_4=new Assign26_4();
		assign26_4.getExchangeNum(10,20);
	}
}
