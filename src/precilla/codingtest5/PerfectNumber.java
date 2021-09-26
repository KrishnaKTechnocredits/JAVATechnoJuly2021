package precilla.codingtest5;
public class PerfectNumber {
	void find5PerfectNumbers() {
		int input=35000000;
		long perfectCount=1;
			while(perfectCount <=5) {
				for(int index=1;index<input/2;index++) {
					long  count=1,sum=0;
						while(count<index) {
							if(index%count==0) 
								sum=sum+count;
						count++;
						}
				if(sum==index) {
					System.out.print(index+" ");
					perfectCount++;
				}
			}
		}
	}
	public static void main(String[] args) {
		PerfectNumber perfectNumber=new PerfectNumber();
		System.out.println("Find first 5 perfect numbers.");
		perfectNumber.find5PerfectNumbers();
	}
}
