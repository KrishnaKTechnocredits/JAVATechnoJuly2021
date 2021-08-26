package margi;

public class Assignment_15_2 {

	//return middle char of all elements
	char[] middleChar(String[] arr) {
		char[] mid = new char[arr.length];
		for(int index=0; index < arr.length; index++) {
			if(arr[index].length() % 2 == 0)
				mid[index] = arr[index].charAt(arr[index].length()/2-1);
			else
				mid[index] = arr[index].charAt(arr[index].length()/2);
		}
		return mid;
	}
	
	void setData() {
		String[] name = {"Hello", "Techno","Credit"};
		System.out.println(middleChar(name));
	}
	
	public static void main(String[] args) {
		Assignment_15_2 str = new Assignment_15_2();
		str.setData();
	}
}
