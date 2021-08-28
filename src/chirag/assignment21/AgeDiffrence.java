package chirag.assignment21;

public class AgeDiffrence {
	
	int ageDiffrenceBetweenYoungAndOld(int [] input) {
		
		int youngestMember = input[0];
		int oldestMember = input[0];
		int diffBetweenYoungAndOld;
		for(int index=0;index < input.length;index++) {
			if(youngestMember > input[index])
				youngestMember=input[index];
			if(oldestMember < input[index])
				oldestMember = input[index];
		}
		diffBetweenYoungAndOld=oldestMember-youngestMember;
		return diffBetweenYoungAndOld;
	}
	public static void main(String[] args) {
		AgeDiffrence ageDiffrence = new AgeDiffrence();
		int [] output = {6,33,23,37,87,98,101};
		System.out.println("Diffrence between youngest and oldest age of a family members : "+ageDiffrence.ageDiffrenceBetweenYoungAndOld(output));
	}

}
