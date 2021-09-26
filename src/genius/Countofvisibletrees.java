package genius;

public class Countofvisibletrees {
	 int getCountOfVisibleTrees(int[] treeHeights) {
		 int visibleTreeCount=0;
		 int maxHeight= 0;
		 for(int index=0;index<treeHeights.length;index++) {
			 if(treeHeights[index]>maxHeight) {
				 maxHeight=treeHeights[index];
				 visibleTreeCount++;
				 
			 }
			 
		 }
		 return visibleTreeCount;
	 }
	

	public static void main(String[] args) {
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		Countofvisibletrees countofvisibletrees = new Countofvisibletrees();
		System.out.println(countofvisibletrees.getCountOfVisibleTrees(treeHeights));
	}

}
