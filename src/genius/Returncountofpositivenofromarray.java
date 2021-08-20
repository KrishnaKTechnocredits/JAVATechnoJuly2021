package genius;

public class Returncountofpositivenofromarray {
    
	int getCountOfPostiveNoFromArray() {
		int count = 0;
		int[] input = {1,-11,-44,23,55,-99,-23,-22};
		for(int index=0;index<input.length;index++) {
			if(input[index]>0) {
			    count++;
			}
			
		}
		System.out.println("Count of positive number from given Array is " +count );
		return count;
	}
	public static void main(String[] args) {
		Returncountofpositivenofromarray returncountofpositivenofromarray = new Returncountofpositivenofromarray();
		System.out.println(returncountofpositivenofromarray.getCountOfPostiveNoFromArray());

	}

}
