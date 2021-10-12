package precilla.assignment46;

import java.util.ArrayList;

//Return ArrayList of first 10 prime numbers in the range [100,500].
public class Program7 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Return ArrayList of first 10 prime numbers in the range [100,500]");
		int primeCount=0;
		for(int index=100;index<500;index++) {
			boolean flag=true;
			for(int i=2;i<Math.sqrt(index);i++) {
				if(index%i==0) {
					flag=false;
					break;
				}
					
			}
			if(flag==true) {
				primeCount++;
				al.add(index);
			}
			if(primeCount==10)
				break;
		}
		System.out.println("Output : "+al);
	}
}
