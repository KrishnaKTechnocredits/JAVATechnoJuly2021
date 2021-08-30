package dattaraj;

public class Assignment_24_P2 {
	void getMaxRptword(String input) {
		String arr[] = input.split(" ");
		int repeatCount = 0;
		String repeatString = "";
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
				}
			}
			if (repeatCount < count) {
				repeatCount = count;
				repeatString = arr[i];
			}
		}
		System.out.println("Max Repeating word with its's frequency --> " + repeatString + " : " + repeatCount);
	}
	
	public static void main(String[] args) {
		Assignment_24_P2 assign_p2= new Assignment_24_P2();
		String str = "Hi Hello Hi Techno Hello Hi";
		
		assign_p2.getMaxRptword(str);
	}
}
