package tanmoy_Roy;

public class Assignment16 {
	
	int countVisibleTrees(int[] array,int N) {
		
		int max = 0;
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (array[i] > max) {
				max = array[i];
				count++;
			}
		}
		return count;
	}
	
		
	String arryToSinglelineString(int[] array,int N) {					//Method to convert array to single line string
			String str=""; 
			for(int i=0;i<N;i++)
				str=str+String.valueOf(array[i])+" ";
			return "{"+str+ "}";
	}
	

	public static void main(String[] args) {
		Assignment16 assignment16=new Assignment16();
		int[] treeHeights = {3,5,5,11,9,10,15,14};
		System.out.println(assignment16.arryToSinglelineString(treeHeights,8)+" array has " 
		+assignment16.countVisibleTrees(treeHeights,8)+" visible trees");
	}
}
