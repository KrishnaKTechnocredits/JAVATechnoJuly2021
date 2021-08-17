package nidhi;

class Assignment_16{
	
	int treeHeight(int arr[]){
		int tree=0;
		int cnt=0;
		for (int i=0;i<arr.length;i++){
			if (arr[i] > tree ){
				cnt++;
				tree = arr[i];
			}
		}
		return cnt;
	}
	
	public static void main(String[] arg){
		Assignment_16 assignment16 = new Assignment_16();
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		System.out.println(assignment16.treeHeight(treeHeights));
	}
}