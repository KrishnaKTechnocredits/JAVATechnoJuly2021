package shyam;

public class VisibleTrees_16 {

     int countVisibleTreesInRange(int[] arr){
    	 
         int count = 0;
 		 int treeheight=0;
 		 
         for (int index = 0; index < arr.length; index++) {
             if (arr[index] > treeheight){
 			    treeheight = arr[index];
 			    System.out.println(arr[index]);
                 count++;
             }
         }
 		return count;

 	}
     
 	public static void main (String[] args){
 		
        int[]arr = { 3,2,5,1,9,10,15,14 };
		VisibleTrees_16 visibleTrees_16 = new VisibleTrees_16();
		System.out.println("Number of Visible trees in given Array is :: " +
		visibleTrees_16.countVisibleTreesInRange(arr));
	}

}
