package margi.Assignment_19;

public class Assignment_19_3 {
	
	//minimum word length from given statement
		void processData(String input) {
			String[] arr=input.split(" ");
			String min = arr[0];
			for(int index=0; index < arr.length; index++) {
				if(min.length() > arr[index].length()) {
					min = arr[index];
				}
			}
			System.out.println(min);
		}
		
		void setData() {
			String input = "good morning technocredits hi hello";
			processData(input);
		}
		
		public static void main(String[] args) {
			Assignment_19_3 minLength = new Assignment_19_3();
			minLength.setData();
		}

}
