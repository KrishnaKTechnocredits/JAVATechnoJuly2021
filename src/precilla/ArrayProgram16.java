package precilla;

public class ArrayProgram16 {
	int treeCount(int[] heightArray) {
		int visibleCount=1,index=0;
		int visibleHeight=heightArray[index];
		for(index=0;index<heightArray.length;index++){
			System.out.print(heightArray[index]+" ");
			if(visibleHeight<heightArray[index]) {
				visibleHeight=heightArray[index];
				visibleCount++;
			}	
		}
		return visibleCount;
	}
	public static void main(String[] args) {
		ArrayProgram16 arrayProgram16=new ArrayProgram16();
		System.out.print("Given Array :");
		int treeHeights[]= {3,5,5,11,9,10,15,14};
		System.out.println("\nCount of visible trees :"+arrayProgram16.treeCount(treeHeights));
	}

}
