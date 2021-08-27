package trupti;

public class Assignment_16 {
	
	void treeHeight(int[] arr) {
		int count=0;
		int var=0;
		for(int index=0; index<arr.length;index++) {
			if(arr[index]>var) {
				var=arr[index];
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] tree) {
		Assignment_16 treeH = new Assignment_16();
		int[] treeHgt= {3,5,5,11,9,10,15,14};
		treeH.treeHeight(treeHgt);
	}

}
