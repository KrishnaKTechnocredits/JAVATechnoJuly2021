/* Test - 8 : 11th Sep'2021
How many pairs can be created from below sock size array. [30]
input = {3,5,6,3,5,3,7,7,8,3,3,5,8,8}
output : 2 + 1 + 1 + 1  = 5 
*/

package harshada.ProgrammingTests;

public class CodingTest8 {
	
	int getShoePair(int input[]) {
		
		int sockPair=0;
		int numberOfSock=0;
		for(int index=0; index < input.length ; index++) { //consider 1st element ie 3
			
			if(input[index] != 0 ) { // don't consider already done elements
				numberOfSock=0;
				int sockIndex = input[index];
				for(int innerIndex=0; innerIndex < input.length ; innerIndex++) { // match 3 with all the remaining
					if(sockIndex==input[innerIndex]) { //keep count of all
						input[innerIndex]=0; // now counted so make it zero so that it wont considered again in count
						numberOfSock++; // if count increment
					}
				}
			}
			
			if(numberOfSock > 1) {
				numberOfSock=(numberOfSock)/2;
				sockPair=sockPair+numberOfSock;
			}
		}
		//System.out.println("Number of pairs ="+ sockPair);
		return sockPair;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodingTest8 codingTest8=new CodingTest8();
		int input[]={3,5,6,3,5,3,7,7,8,3,3,5,8,8};//2+1+1+1=5
		int totalPairs1=codingTest8.getShoePair(input);
		System.out.println("Number of pairs= "+ totalPairs1);
		int input1[]={1,1,2,2,1,2,3,5,5,4,3,8,7,8,7,9,1,1,4}; //=9
		int totalPairs2=codingTest8.getShoePair(input1);
		System.out.println("Number of pairs ="+ totalPairs2);
		
	}
	
}

