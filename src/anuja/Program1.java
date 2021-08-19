package anuja;

public class Program1 {
	
	int count,count1;
	
	void positiveCount(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				count++;
			else
				continue;
		}
		
		System.out.println("Count of positive numbers is "+count);
	}
	
	void zeroCount(int[] input) {
		for(int i=0;i<input.length;i++) {
			if(input[i]==0)
				count1++;
			else
				continue;
		}
		System.out.println("Count of zeroes in array  is "+count1);
	}
	
	void display(int num) {
		for(int i=num;i>num-5;i--) {
			System.out.print(i+",");
			
		}
	}
	
	public static void main(String[] args) {
		Program1 program1=new Program1();
		int[] arr= {1,-11,-44,23,55,-99,-23,-22};
		program1.positiveCount(arr);
		int[] input= {1,-11,0,0,55,0,-23,0};
		program1.zeroCount(input);
		program1.display(50);
	}

}
