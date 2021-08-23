package ramkrishna;

public class FamilyMember {

	
	int gitDifferenceBetweenOldYoung(int[] num) {
		
		int oldest= num[0];
		int youngest = num [0];
	
		for(int index=0; index<num.length ; index++ ) {
			if(num[index]>oldest) {
				oldest= num[index];
			} else if(num[index]<youngest) {
				youngest= num[index];
			}
			
		} return oldest-youngest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  FamilyMember familymembr = new FamilyMember();
		  int[] age = {10,34,38,68,72,95,6};
		  System.out.println("Difference between oldest and youngest family member"+familymembr.gitDifferenceBetweenOldYoung(age));

	}

}
