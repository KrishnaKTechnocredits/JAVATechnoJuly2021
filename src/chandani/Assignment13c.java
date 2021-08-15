package chandani;

class Assignment13c{
	
	void get5SmallerNumber(int[] input){
		
		int minnumber = 50;
		System.out.println("\n 5 smaller numbers of given number are : \n");
		for(int index = 0; index < input.length; index++){
			minnumber--;
			input[index] = minnumber;
			System.out.println(minnumber);
			}
		}
	
	public static void main(String[] args){
		Assignment13c assignment13c = new Assignment13c();
		int[] arr = new int[5];
		assignment13c.get5SmallerNumber(arr);
	}
}