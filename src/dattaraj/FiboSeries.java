package dattaraj;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FiboSeries fibo = new FiboSeries();
		fibo.PrintFiboSeries(10);

	}

	public void PrintFiboSeries(int n){
		int n1=0;
		int n2=1;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<n;i++){	
			int n3=n1+n2;
			System.out.print(" "+n3);	
			n1=n2;
			n2=n3;
		}
	}
}
