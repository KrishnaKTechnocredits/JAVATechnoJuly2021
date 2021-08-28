package rushikesh.arrayprograms;

public class Assignment_21 {
	int getMinNum(int[] age) {
		int minNum=0;
		for(int index=0;index<age.length;index++) {
			for(int index1=1;index1<age.length;index1++)
				if(age[index]<age[index1])
					minNum=age[index];
		}
		return minNum;
	}
	int getMaxNum(int[] age) {
		int maxNum=0;
		for(int index=0;index<age.length;index++) {
			for(int index1=1;index1<age.length;index1++)
				if(age[index]>age[index1])
					maxNum=age[index];
		}
		return maxNum;
	}
	
	int getDiffMaxMin(int[] age) {
		int diff=0;
		diff=getMaxNum(age)-getMinNum(age);
		return diff;
	}
	
	public static void main(String[] args) {
		Assignment_21 assignment_21=new Assignment_21();
		int[] age = {10,34,38,68,72,95,6};
		int ageDiff=assignment_21.getDiffMaxMin(age);
		System.out.println(ageDiff);
	}
}
