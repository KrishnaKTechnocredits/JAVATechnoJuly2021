package prerana;

public class Assignment21 {
	int oldNum(int[] n) {
		int max =0;
		for(int index =0;index<n.length ;index++) {
			if(n[index] > max) {
				max = n[index];
				
			}
			
		}
		return max;
		
	}
	int newNum(int[] n) {
		int min=0;
		for(int index =0;index<n.length ;index++) {
			if(n.length-1>min) {
				min=n.length-1;
				
			}
	    }
		return min;
	}
	
	public static void main(String[] args) {
		Assignment21 a=new Assignment21();
		
		System.out.println("Difference between old and new numbers are: ");
		
		int[] age= {10,34,38,68,72,95,6};
		
		System.out.println(a.oldNum(age) - a.newNum(age));
		
		
		
		
	

	}

}
