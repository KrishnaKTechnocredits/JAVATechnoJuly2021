package chandani.Assignment_24;

public class Assignment24b{

	void getRepeatingWordinString(String str) {
			
		int maxcount = 0;
		String[] arr = str.split(" ");
		String maxrepeatword = "";
		String temp;

		for(int index=0; index<arr.length; index++) {
			int count = 0;
			temp = arr[index];
			for(int index1=0; index1<arr.length; index1++) {
				if(temp.equals(arr[index1]))
					count++;
			}
			
			if(maxcount < count) {
					maxcount = count;
					maxrepeatword = arr[index];	
			}
		}
		System.out.println("Maximum times repeating word and its frequency is : " + maxrepeatword + " : " + maxcount);
	}
	
	public static void main(String[] args) {
		Assignment24b assignment24b = new Assignment24b();
		String input = "Hi Hello Hi Techno Hello Hi";
		assignment24b.getRepeatingWordinString(input);
	}
}
