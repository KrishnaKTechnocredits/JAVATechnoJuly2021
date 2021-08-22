//Assignment 16 : 16th Aug'2021
//
//program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
//int[] treeHeights = {3,5,5,11,9,10,15,14};
//output : 4
//
//Two assignments for today and another two for Monday.
//
//Create a new branch for every assignment.
//Create a separate class for every program.
//Ex - For assignment 13 create one branch called yourName_Assignment_13
//And push 3 java files of each program. 


package bhakti;

public class Assignment_16_hight {
	
	void getCountOftreeVisisble() {
		int[] treehight=  {1,12,5,41,9,10,15,17};
		int count=1;
		int maxHight= treehight[0];
		
		for (int index=1; index < treehight.length; index++) {
			
			if (maxHight< treehight[index]) {
			  count++;	
			  maxHight=treehight[index];
			}  	
		}
	 
		 System.out.println("Number of trees visible are: "+count);
			
		}
		
	public static void main (String[] jj) {
		Assignment_16_hight assignment_16= new Assignment_16_hight();
		assignment_16.getCountOftreeVisisble();
	}
}
