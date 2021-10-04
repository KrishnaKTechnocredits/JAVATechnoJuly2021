/*
		Find out the max number from an Array List.
		input: [10,7,99,53,74]
		output: 99*/

package somnath_Assignment_44;
import java.util.ArrayList;

		public class Assignment_44 {

	void getMaxNum(ArrayList<Integer> sl) {
		int maxNum= sl.get(0);
		for(int index =0;index < sl.size();index++) {
			if(sl.get(index) > maxNum) {
				maxNum = sl.get(index);
			}
		}
		System.out.println("Maximum Number Form An Array List : "+maxNum);
	}

	public static void main(String[] args) {
		Assignment_44 assignment_44 = new Assignment_44();
		ArrayList<Integer> sl=new ArrayList<Integer>();
		sl.add(10); sl.add(7); sl.add(99); sl.add(53); sl.add(74);
		assignment_44.getMaxNum(sl);
	}
} 
