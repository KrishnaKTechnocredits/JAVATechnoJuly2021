package amol_Pawar.assignment21;

public class Assignment_21 {

	void getAgeDifference(int age[]){
		int young=age[0];
		int old=age[0];
		for(int index=0;index<age.length;index++)
		{
			if(age[0]>age[index])
			{
				young=age[index];
			}
			else if(age[0]<age[index])
			{
				old=age[index];
			}
		}
		System.out.println("Difference between oldest age "+old+" and youngest age "+young+" family member is : "+(old-young));
	}
	public static void main(String[] args) {
		Assignment_21 assignment_21=new Assignment_21();
		int[] age = {10,34,38,68,72,95,6};
		assignment_21.getAgeDifference(age);
	}
}
/*Find the difference between oldest and youngest family member.
Age is in the form of array.
int[] age = {10,34,38,68,72,95,6};
output : 89*/