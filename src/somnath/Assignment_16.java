package somnath;
class Assignment_16 {

    int countInRange(int[] arr){

        int count = 0;
		int treeheight=0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > treeheight){
			    treeheight=arr[index];
                count++;
            }
        }
		return count;

	}

     public static void main (String[] args){

        int[]arr = { 3,5,5,11,9,10,15,14 };
		Assignment_16 assignment16 = new Assignment_16();
		System.out.println("--------------------******----------------");
		System.out.println("Number of Visible trees in given Array is :: " +
		assignment16.countInRange(arr));
	    System.out.println("--------------------******----------------");
	}	

}


 