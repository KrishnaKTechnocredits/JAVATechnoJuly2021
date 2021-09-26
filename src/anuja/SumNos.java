package anuja;

public class SumNos {
	int sum=100;
	int num=1;
	int i=0;
	int s=0;
	
	void display() {
		for(i=0;s<=sum;i++)
		s=s+i;
		System.out.println("Sum greater than 100 is "+s);
		System.out.println("Nos whose sum is greater than 100 is "+ (i-1));
}
	
	public static void main(String[] args) {
		SumNos sumnos=new SumNos();
		sumnos.display();
	}
}

