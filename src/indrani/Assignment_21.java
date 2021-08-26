package indrani;

public class Assignment_21{

	int getAgeDifferenceBetweenOldestAndYoungest(int[] input){
		int maximumAge = input[0];
		int minimumAge = input[0];
		
		for (int index = 1; index < input.length; index++){
			if (input[index] > maximumAge)
				maximumAge = input[index];
			else if (input[index] < minimumAge)
				minimumAge = input[index];
		}
		return (maximumAge - minimumAge);
	}

	public static void main(String[] args){
		int[] age = {10, 34, 38, 68, 72, 95, 6};
		System.out.print(new Assignment_21().getAgeDifferenceBetweenOldestAndYoungest(age));
	}
}
