package priti;

class Assingment_16{

	int getCntVisibleTree(int[] input){
		//System.out.println("length of array treeheight is = "+ input.length);
		int max=0;
		int maxCnt=0;
		for (int index= 0; index<input.length; index++){
			if (max<input[index]){
				max= input[index];
				maxCnt++;
			}
		}
		return maxCnt;
	}

	public static void main(String[] a){
	
	int[] treeheight = new int[8];
	treeheight [0] = 3;
	treeheight [1] = 5;
	treeheight [2] = 5;
	treeheight [3] = 11;
	treeheight [4] = 9;
	treeheight [5] = 10;
	treeheight [6] = 15;
	treeheight [7] = 14;
		
	Assingment_16 assingment_16 = new Assingment_16();
	//int ans=assingment_16.getCntVisibleTree(treeheight);
	System.out.println("Maximum visible tree count is = "+assingment_16.getCntVisibleTree(treeheight) );
	}
}