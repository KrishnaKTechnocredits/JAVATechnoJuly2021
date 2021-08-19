package sourabh;

public class Assignment_16 {

	void visibleTreecount(int[] treearr) {
		int count = 0;
		int height = 0;
		for(int index = 0; index < treearr.length; index++) {
			if(treearr[index] > height) {
				height = treearr[index];
				count++;
			}
		}
		System.out.println("Visible tree count is "+count);
	}

	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		Assignment_16 count = new Assignment_16();
		count.visibleTreecount(treeHeights);
	}
}
