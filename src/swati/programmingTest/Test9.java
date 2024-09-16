package swati.programmingTest;

import java.util.TreeSet;

public class Test9 {
	public static void main(String[] args) {
		int[] arr= {-3,5,3,-1,10,15,-4};
		TreeSet<Integer> out=new TreeSet<Integer>();
		for(int index=0;index<arr.length;index++) {
			if(arr[index]<0) {
				out.add(arr[index]);
			}
		}
		
		System.out.println(out);
		System.out.println(out.last());
		
		
		
	}


}
