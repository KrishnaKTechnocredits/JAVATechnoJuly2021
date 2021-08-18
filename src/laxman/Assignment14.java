package laxman;

public class Assignment14 {
	
		int[]num= {1,11,44,23,55,99,23};
		
		int getMaximumNumber(int[]input) {
		int max=0;
		for(int index=0;index<num.length;index++) {
			if( max < input[index]) {
				max=input[index];
		}
		}
			return max;
		}
		
		int getMinimumNumber(int[]input) {
		int min=1;
		for(int index=0;index<num.length;index++) {
			if( min > input[index]) {
				min=input[index];
		}
		}
			return min;
		}
		int getDiffBtwnMaxAndMinNumber(int[]input) {
			int max=0;
			int min=1;
			for(int index=0;index<num.length;index++) {
				if( max < input[index]) {
					max=input[index];
			}
			}
			for(int index=0;index<num.length;index++) {
				if( min > input[index]) {
					min=input[index];
			}
			}return max-min;
		}
		int getMaxiEvenNumber(int[]input) {
			int maxO=0;
			int maxE=0;
			for(int index=0;index<num.length;index++) {
				if(input[index]%2==0);{
					if( maxO < input[index]) 
					maxO=input[index];
			}if(input[index] > maxE) {
				if(input[index]%2==0)
					maxE =input[index];
			}
			}
				return maxO-maxE;
		}
		public static void main(String[] args) {
		
			Assignment14 assignment14= new Assignment14();
			System.out.println("Maximum number is "+ assignment14.getMaximumNumber(assignment14.num));
			System.out.println("Minimum number is "+ assignment14.getMinimumNumber(assignment14.num));
			System.out.println("Difference Between Max and Min number is  "+ assignment14.getDiffBtwnMaxAndMinNumber(assignment14.num));
			System.out.println("Difference between MaxEven and MaxOdd number is  "+ assignment14.getMaxiEvenNumber(assignment14.num));

		}
		
}
