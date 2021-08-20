package chandani;

class Assignment19d{

	int getSumOfString(String str){
		
		int sum = 0;
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			sum = sum + Integer.parseInt(arr[index]);
			}
		return sum;
	}
	
	public static void main (String[] args){
		Assignment19d assignment19d = new Assignment19d();	
		String output = "10 20 30 40";
		System.out.println("min length of words in the given String is : " + assignment19d.getSumOfString(output));
	}	
}