package tanmoy_Roy;

public class Assignment15_2 {
	void getMiddleCharOfElements(String[] array,int N) {
		for(int i=0;i<N;i++) {
			if (array[i].length()%2==0)
				System.out.println("Middle Charater of "+ array[i]+ " are : "+array[i].charAt(array[i].length()/2 - 1)+
						" and "+array[i].charAt(array[i].length()/2));
			else
				System.out.println("Middle Charater of "+ array[i]+ " is : "+array[i].charAt(array[i].length()/2));
		}
	}
	
	public static void main(String[] args) {
		Assignment15_2 assignment15= new Assignment15_2();
		String[] array = {"hello","Techno","Nidhi","Ankit"};
		assignment15.getMiddleCharOfElements(array, 4);
	}
}
