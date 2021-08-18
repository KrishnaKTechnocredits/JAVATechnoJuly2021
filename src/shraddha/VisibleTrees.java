package shraddha;

public class VisibleTrees {
	
     public static void main (String[] args){
        int[]arr = { 3,2,5,1,9,10,15,14 };
		VisibleTrees visibleTrees = new VisibleTrees();
		System.out.println("-----------------------------------");
		System.out.println("Number of Visible trees in given Array is :: " +
		visibleTrees.countVisibleTreesInRange(arr));
	    System.out.println("-----------------------------------");
	    
	    int[] array = { 4,12,5,9,10,15,4 };
	  		VisibleTrees visibleTrees1 = new VisibleTrees();
	  		System.out.println("-----------------------------------");
	  		System.out.println("Number of Visible trees in given Array is :: " +
	  		visibleTrees1.countVisibleTreesInRange(array));
	  	    System.out.println("-----------------------------------");
	}
     
     int countVisibleTreesInRange(int[] arr){
         int count = 0;
 		int treeheight=0;
         for (int index = 0; index < arr.length; index++) {
             if (arr[index] > treeheight){
 			    treeheight = arr[index];
 			    System.out.println("-->"+arr[index]);
                 count++;
             }
         }
 		return count;

 	}

} 
 