package monali;

public class VisibleTree {

/*	Assignment 16 : 16th Aug'2021

	program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
	int[] treeHeights = {3,5,5,11,9,10,15,14};
	output : 4
*/
		void isTreeVisible(int[] treeHeights){
			int maxValue=0;
			int count=0;
		
			for(int index=0;index<treeHeights.length;index++){
				if(maxValue<treeHeights[index]){
					maxValue=treeHeights[index];
					count++;
					System.out.println("Height of visible tree : "+maxValue);
				}	
			}
			System.out.println("Visible Trees count is : "+count);
			
		}
		public static void main(String[] args) {
			int[] treeHeights={3,5,5,11,9,10,15,14};
			VisibleTree visibleTree=new VisibleTree();
			visibleTree.isTreeVisible(treeHeights);
		}
	}


