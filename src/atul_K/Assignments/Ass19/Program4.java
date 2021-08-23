package atul_K.Assignments.Ass19;

public class Program4 {
	int getSumofNum(String str) {
		
		String[] arr = str.split(" ");
		int sum = 0;
		for (int index=0;index < arr.length;index++) {
			sum = sum + Integer.parseInt(arr[index]);
		}
		return sum;
	}
	
	void display(int sum) {
		System.out.println(sum);
	}
	
	public static void main (String[] args) {
		String str = "10 10 20 30";
		Program4 p4 = new Program4();
		p4.display(p4.getSumofNum(str));
	}
}
