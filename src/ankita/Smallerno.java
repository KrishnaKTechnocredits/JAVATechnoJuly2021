package ankita;

public class Smallerno {

	int [] getFiveSmallerno(int num,int requiredcount) {
		int[]input=new int[requiredcount];

		int point=0;
		for(int index=num-1;index>=(num-5);index--) {
			
			if(point<requiredcount) 
			{
				input[point]=index;
				point++;
			}
		}
		return input;
	}
	public static void main(String[] args) {
		Smallerno smallerno=new Smallerno();
		int[]inputarr=new int[5];
		inputarr=smallerno.getFiveSmallerno(50, 5);
		for (int i=0;i<inputarr.length;i++) {
			System.out.println(inputarr[i]);
		}
	}
}
