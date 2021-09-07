package purshottamJoshi;

class Assignment26_2{
	void reverStringArray(String[] input){
		for(int index = input.length-1; index >=0; index--) {
			System.out.println(input[index]);
		}
	}
	public static void main(String[] args) {
	String[] input={"Credits", "Techno","From","Diwali","Happy"};
	Assignment26_2 assignment26_2 = new Assignment26_2();
	assignment26_2.reverStringArray(input);
	}
}