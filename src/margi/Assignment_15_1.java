package margi;

public class Assignment_15_1 {
	
	//return difference of even length name and odd length name
	int processData(String[] input) {
		int even=0, odd=0;
		for(int index=0; index < input.length; index++) {
			if(input[index].length() % 2 == 0) 
				even = even + input[index].length();
			
			else
				odd = odd + input[index].length();

		}
		return Math.abs(even-odd);
	}
	
	void setData() {
		String[] arr = new String[4];
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		System.out.println("Difference of even length name and odd length name: " + processData(arr));
	}
	
	public static void main(String[] args) {
		Assignment_15_1 diff = new Assignment_15_1();
		diff.setData();
	}
}
