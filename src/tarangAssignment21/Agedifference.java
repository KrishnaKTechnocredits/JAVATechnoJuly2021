package tarangAssignment21;

public class Agedifference {
	
	int diffAge(int [] arr) {
		int max=arr[0];
		int min=arr[0];
		for(int index=0;index<arr.length;index++) {
			
			if(arr[index]> max)
				max=arr[index];
			if(arr[index]< min)
				min=arr[index];			
	}
	return max-min;
}
	public static void main(String[] args) {
		Agedifference age=new Agedifference();
		int a[]= {10,34,38,68,72,95,6};
		System.out.println("Difference between max & min age is "+ age.diffAge(a));
		
	}
}
