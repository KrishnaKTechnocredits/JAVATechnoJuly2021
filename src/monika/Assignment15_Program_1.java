package monika;

public class Assignment15_Program_1 {

	int x=10;
	int getDifferenceofEvenOddStringLength(String[] str) {
		
		int evenSum=0, oddSum=0;
		for(int index=0;index<str.length;index++) {
			if(str[index].length()%2==0)
				evenSum+=str[index].length();
			else
				oddSum+=str[index].length();
		}
	
	return evenSum-oddSum;
}
	public static void main(String[] args) {
		String[] input= {"Maulik","Tecnho","Nidhi","Rahul"};
		Assignment15_Program_1 assignment15_Program_1=new Assignment15_Program_1();
		System.out.println("Difference Between Even length String and Odd length String :"+assignment15_Program_1.getDifferenceofEvenOddStringLength(input));
	}
}
