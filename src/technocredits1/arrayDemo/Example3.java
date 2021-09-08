package technocredits1.arrayDemo;

public class Example3 {

	String[] names = new String[3];
	
	int getElementLengthSum(String[] arr) {
		int lengthSum = 0;
		for(int index=0;index<arr.length;index++) {
			lengthSum = lengthSum + arr[index].length();
		}
		return lengthSum;
	}
	
	int processData() { //3
		String[] arr = new String[4]; //4
		arr[0] = "Maulik";
		arr[1] = "Techno";
		arr[2] = "Nidhi";
		arr[3] = "Ankit";
		int ans = getElementLengthSum(arr);
		return ans;
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3(); //1
		//int ans = example3.processData(); //2
		//ans = ans + 10;
		//ans = ans/2;
		//System.out.println(ans);
		System.out.println(example3.processData());
	}
}

