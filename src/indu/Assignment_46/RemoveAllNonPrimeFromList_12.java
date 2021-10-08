/*xample 13:
Remove all non prime numbers from given Set.
input : [19,12,18,17,23,22]
output : [19,17,23]*/
package indu.Assignment_46;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllNonPrimeFromList_12 {

	static void removeAllNonPrime()
	{
		First10PrimeNUmber_7 a7 = new First10PrimeNUmber_7();
		ArrayList<Integer> alist = new ArrayList<>(Arrays.asList(19,12,18,17,23,22));
		System.out.println("Input Array is \n"+alist);
		ArrayList<Integer> output = new ArrayList<>();
		
		for(int num : alist)
		{
			if(a7.isPrime(num))
			{
				output.add(num);
			}
		}
		System.out.println("Array after Removing PrimeNum:\n"+output);
	}
	
	public static void main(String[] args) {
		removeAllNonPrime();
	}
}
