//write a program that will return difference of even length name and odd lenght name.
package shreya;

public class EvenOddLenghtDiff {
	int getEvenLenghtOddLenght(String[] num){
		int evenSum=0;
		int oddSum=0;
		for(int index=0;index<num.length;index++) {
			if(num[index].length()%2==0)
				evenSum=evenSum+num[index].length();
			else 
				oddSum=oddSum+num[index].length();
	
		}
		return evenSum-oddSum;
}

	public static void main(String[] args) {
		String[] input = {"Maulik", "Techno", "Nidhi", "Ankit"};
		EvenOddLenghtDiff evenOddLenghtDiff=new EvenOddLenghtDiff();
		int evenSumOddSum=evenOddLenghtDiff.getEvenLenghtOddLenght(input);
		System.out.println("Difference between even length name & odd length name is "+evenSumOddSum);
	}
}
