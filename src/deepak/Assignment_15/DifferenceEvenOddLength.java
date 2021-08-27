//Assignment 15 [Program 1] [difference of even length name and odd length name] DATE: 08/16
package deepak.Assignment_15;

public class DifferenceEvenOddLength {
	
	int evenCharLength(String[] array) {
		int evenStringLen=0;
		int arrayCnt=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].length() % 2 == 0) {
				evenStringLen=array[i].length();
				arrayCnt++;
			}
		}evenStringLen=evenStringLen*arrayCnt;
		return evenStringLen;
	}
	
	int oddCharLength(String[] array) {
		int oddStringLen=0;
		int arrayCnt=0;
		for(int i=0;i<array.length;i++) {
			if(array[i].length() % 2 != 0) {
				oddStringLen=array[i].length();
				arrayCnt++;
			}
		}oddStringLen=oddStringLen*arrayCnt;
		return oddStringLen;
	}
	
	int differenceEvenOddLen(String[] array) {
		return evenCharLength(array)-oddCharLength(array);
	}
	
	
	public static void main(String[] args) {
		DifferenceEvenOddLength obj=new DifferenceEvenOddLength();
		String[] array= {"Maulik","Techno","Nidhi","Ankit"};
		System.out.println("Difference between the even length and Odd length of strings is : "+obj.differenceEvenOddLen(array));
	}
}
