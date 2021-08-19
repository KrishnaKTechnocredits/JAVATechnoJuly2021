package swati;
class DiffOddEvenLength{
	
	int returnOddEvenCount(){
		int diff=0,evenSum=0,oddSum=0;
		String [] input= new String[4];
		input[0]="Maulik";
		input[1]="Techno";
		input[2]="Nidhi";
		input[3]="Ankit";
		
		for(int index=0;index<input.length;index++){
				if(input[index].length() % 2 == 0)
					evenSum=evenSum+input[index].length();
				else
					oddSum=oddSum+input[index].length();
		}
		
		return diff=evenSum-oddSum;
	}
	
	public static void main (String[] a){
		DiffOddEvenLength diffOddEven =new DiffOddEvenLength();
		int oddEvenDiff=diffOddEven.returnOddEvenCount();
		System.out.println("Difference of even length name and odd lenght name: "+ oddEvenDiff);
	}
}
	
	