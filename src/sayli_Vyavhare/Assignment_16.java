package sayli_Vyavhare;

public class Assignment_16 {

	int  count ,visibleTree=0,visibleCount;
	int[] treeHeight= {3,5,5,11,9,10,15,14};
	
	int getCountOfVisibleTree(){
		
		for(int index=0;index<treeHeight.length;index++) {
			if(treeHeight[index]>visibleTree) {
				visibleTree=treeHeight[index];
			    count++;			
			}
		}
		return count;		
	}
	
	public static void main(String[] args) {
		Assignment_16 assignment_16=new Assignment_16();
		int visibleCount=assignment_16.getCountOfVisibleTree();
		System.out.println("Count of visibe trees:"+visibleCount);	
	}
}
