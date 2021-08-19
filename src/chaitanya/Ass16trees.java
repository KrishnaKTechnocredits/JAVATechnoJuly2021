//Assignment 16 : 16th Aug'2021

//program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
//int[] treeHeights = {3,5,5,11,9,10,15,14};
//output : 4


package chaitanya;

public class Ass16trees {
	
	int countofVisibleTrees(int[] inputarr) {
		int count = 0, max = 0;
		for (int i= 0 ; i<inputarr.length ; i++) {
				if(inputarr[i] > max) {
					max =  inputarr[i];
					count++;
				}
		}
		return count ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputarr = {3,5,5,11,9,10,15,14};
		Ass16trees ass16trees = new Ass16trees();
		System.out.println("No. of Visible Trees : " + ass16trees.countofVisibleTrees(inputarr));
	}

}
