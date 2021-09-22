package bhakti_CodingTest;

import java.util.Arrays;

public class CodingTest_8_SocksPair_2 {
	 
		void getPairOfSocks(int [] input) {
			int[] output= new int[input.length];
			for (int i=0; i< input.length; i++) {
				output[i]= input[i];
			}
			int pair=0;
			for (int i=0; i < input.length; i++) {
				int count=0;
				for (int j=0; j< input.length; j++) {
					if (input[i]==output[j]) {
						output[j]=0;
						count++;
					}
							
				}
				pair = pair+count/2;
			}
			System.out.println("Number pair :" +pair);	
			
		}



		public static void main(String[] args) {
			CodingTest_8_SocksPair_2 pairOfSocks = new CodingTest_8_SocksPair_2();
			int[] input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8};
			pairOfSocks.getPairOfSocks(input);
			 
		}
	}

