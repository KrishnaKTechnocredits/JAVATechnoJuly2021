package precilla.assignment21;

import java.util.Arrays;
public class AssignmentProgram {

	int differenceBetwenOldestAndYougest(int[] array) {
		int youngestMember=array[0];
		int oldestMember=array[0];
		int difference;
		for(int index=0;index<array.length;index++) {
			if(youngestMember>array[index])
				youngestMember=array[index];
			if(oldestMember<array[index])
				oldestMember=array[index];
		}
		difference=oldestMember-youngestMember;
		return difference;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssignmentProgram assignmentProgram=new AssignmentProgram();
		int[] age= {10,34,38,68,72,95,6};
		System.out.println("Age of family members are " +Arrays.toString(age));
		System.out.print("Difference between oldest and youngest family member is : " +assignmentProgram.differenceBetwenOldestAndYougest(age));	
		
	}
}
