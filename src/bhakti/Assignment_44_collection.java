package bhakti;

import java.util.ArrayList;

public class Assignment_44_collection {
	
	public static void main(String[] args) {
		ArrayList<Integer> num= new ArrayList();
		num.add(2);
		num.add(200);
		num.add(23);
		num.add(1);
		int max=0;
		for (Integer n: num) {
			if (n> max)
				max=n;
		}
		System.out.println("Max Number is by using enhance for loop : "+max);
	 
		int max1=0;
		for (int i=0; i< num.size(); i++) {
			 
			if (max1 < num.get(i)) {
				max1=num.get(i);
			}	
		}
		System.out.println("Max Number is by using normal for loop : "+max1);
		
	}

}
