package margi.Assignment_19;

public class Assignment_19_2 {
	
	//maximum word length from given statement
	void processData(String input) {
		String[] arr=input.split(" ");
		String max = arr[0];
		for(int index=0; index < arr.length; index++) {
			if(max.length() < arr[index].length()) {
				max = arr[index];
			}
		}
		System.out.println(max);
	}
	
	void setData() {
		String input = "good morning technocredits hi hello";
		processData(input);
	}
	
	public static void main(String[] args) {
		Assignment_19_2 maxLength = new Assignment_19_2();
		maxLength.setData();
	}
}
