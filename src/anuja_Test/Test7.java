package anuja_Test;

public class Test7 {
	
	void display(int[] input) {
		int count=0;
		for(int i=-2;i<input.length-3;i++) {
			//int a=input[i+2];
			
			if(input[i+2]<input[i+3] && input[i+3]<input[i+4]) {
				count++;
				System.out.println(count +" triplet is there :");
				System.out.print(input[i+2]+",");
				System.out.print(input[i+3]+",");
				System.out.print(input[i+4]);
			}
		}
	}
	public static void main(String[] args) {
		Test7 test7=new Test7();
		int[] input= {10,9,11,6,23,25,22,66,34};
		test7.display(input);
		
	}

}
