package swati;
class SmallerNumbers{

	void return5smaller(int number){
		System.out.println("5 smaller numbers of the given number is:");
		int[] input = new int[5];
		for(int index=0;index<input.length;index++){
			 number=number-1; 
			 input[index]=number;
			 System.out.println(input[index]);
			
			}
		}
	
	public static void main(String[] a){
		SmallerNumbers smallernumbers=new SmallerNumbers();
		smallernumbers.return5smaller(50);
	}
			
}