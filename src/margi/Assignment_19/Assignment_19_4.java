package margi.Assignment_19;

public class Assignment_19_4 {

	//sum of all numbers in given statement
	int processData(String input){
		String[] arr=input.split(" ");
		int sum=0;
		for(int index=0; index < arr.length; index++) {
			sum += Integer.parseInt(arr[index]);
		}
		return sum;
	}
	
	void setData() {
		String data = "10 10 20 30";
		System.out.println("Sum is: " + processData(data));
	} 
	
	public static void main(String[] args) {
		Assignment_19_4 num = new Assignment_19_4();
		num.setData();
	}
}
