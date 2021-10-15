/*Example 7 : 
Return ArrayList of first 10 prime numbers in the range [100,500].*/

package bhaktiAssignment_46;

import java.util.ArrayList;

public class Program_7_PrimeNumber {
	
	  static void primeNumber(int n) {
		  ArrayList output= new ArrayList();
		  int count=0, i=2, number=2;
		  while (count <n ) {
			  boolean flag=false;
			  for ( i=2; i<= number/2; i++) {
				  if (number%i==0) {
					  flag= true;
					  break;
				  } 
			  }
			  if (flag==false) {
				  output.add(number);
				  count++;
			  }
			  number++;	  
		  }
		  System.out.println(output);
	  }
	  public static void main(String[] args) {
		  primeNumber(20);
		 
	}
}
