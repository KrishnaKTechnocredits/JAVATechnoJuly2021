package anuja;

public class NewPrimeNos {
	int primenum;
	int n=1;
	int count;
	int sum;
	
	void displayPrimeNos(int num) {
		while(n<=num) {
		count=0;
		primenum=2;
		while(primenum<=n/2) {
			if(n%primenum==0) {
			count++;	
			break;
			}
			primenum++;
		}
		if (count==0 && n!=1) {
			System.out.println(n + " is a prime number");
		}
		n++;
	}
	}
	
	public static void main(String[] args) {
			NewPrimeNos newprimenos=new NewPrimeNos();
			newprimenos.displayPrimeNos(100);
	}
}
