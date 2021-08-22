package indrani;

public class Assignment_16 {
       int count;
       
       void displayHeight(int[] treeHeight) {
    	   for(int i=1;i<treeHeight.length;i++) {
    		   if(treeHeight[i-1]<treeHeight[i])
    			   count++;
    		   else if((treeHeight[i-1]>treeHeight[i])|| (treeHeight[i]==treeHeight[i-1])) 
    			   continue;
       }
            System.out.println("Visible tree count is : "+count);
       }
        public static void main(String[] args) {
        	Assignment_16 assignment16 = new Assignment_16();
        	int[] treeHeight = {3,5,5,11,9,10,15,14};
        	assignment16.displayHeight(treeHeight);
        }
}
