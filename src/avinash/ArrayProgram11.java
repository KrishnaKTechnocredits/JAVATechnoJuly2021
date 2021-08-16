package avinash;

/*program 1 : From given array find out count of visible trees. [if question is not clear, please watch recording.]
int[] treeHeights = {3,5,5,11,9,10,15,14};
output : 4*/

class ArrayProgram11{

	int visibleTree(int[] treeHeights){
		int count=0;
		int output=0;
		for(int index=0;index<treeHeights.length;index++){

			if(treeHeights[index]>output){
				count++;
				output=treeHeights[index];

			}
		}
		return count;
	}

	public static void main(String[] args){
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		ArrayProgram11 arrayProgram11=new ArrayProgram11();
		System.out.println("Count of visible trees: ");
		System.out.println(arrayProgram11.visibleTree(treeHeights));
	}
}
