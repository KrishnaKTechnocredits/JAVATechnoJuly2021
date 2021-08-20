package anuja;

public class Assignment14 {
	
	static int max=0;
	 int min=100;
	 int diff;
	 int even,odd=0;
	 int diff1;
	 int maximum,maximum1=0;
	
	void maxNos(int[] arr) {
		for (int i=0;i<arr.length;i++ ) {
			if(max<arr[i]) {
				 max=arr[i];
			}
			else 
				continue; //(i+1) takes outside the array.legth range
		}
		System.out.println("Max value element in array is "+max);
	}
	
	void minNos(int[] arr) {
		for (int i=0;i<arr.length;i++ ) {
			if(min>arr[i]) {
				 min=arr[i];
			}
			else 
				continue; //(i+1) takes outside the array.legth range.So we have ignored it
		}
		System.out.println("Min value element in array is "+min);
	}
	
	void difference() {
		if(max>min)
			 diff=max-min;
		else
			diff=min-max;
		System.out.println("Difference between max and min number in given array is "+ diff);
	}
	
	int diffOddEven(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				//even=arr[i]+even;
				if(maximum<arr[i]) {
					maximum=arr[i];
				}
				else {
					continue;
				}
				}			
			else if(i%2!=0) {
				//odd=arr[i]+odd;
				if(maximum1>arr[i])
					maximum1=arr[i];
				else
					continue;
			}
			/*diff1=maximum-maximum1;*/
		//System.out.println("Difference is "+ maximum);
	}
		if(maximum>maximum1)
			diff1=maximum-maximum1;
		else
			diff1=maximum1-maximum;
		System.out.println("Difference between  max odd and max even in given array is "+ diff1);
		return diff1;
	}

	public static void main(String[] args) {
		Assignment14 assignment14=new Assignment14();
		int[] arr= {1,11,44,23,55,99,23};
		//int[] input= {1,11,44,23,55,99,23};
		//System.out.println(arr.length);
		assignment14.maxNos(arr);
		assignment14.minNos(arr);
		assignment14.difference();
		int ans=assignment14.diffOddEven(arr);
		System.out.println(ans);
	}

}
