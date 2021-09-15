package nidhi;

//Test 5 :
//Find first 5 perfect numbers.

class CodingTest_5{
	
	boolean checkPerfect(double num){
		int sum=0;
		for (int i=1; i <num; i++){
			if (num%i == 0)
				sum = sum + i;
		}
		if (sum != num)
			return false;
		else
			return true;
	}
	
	void checkfirst5(double startnum){
		int cnt=0;
		while (cnt < 4){
			if (checkPerfect(startnum)) {
				System.out.println(startnum);
				cnt++;
				//System.out.println(cnt);
			}
		startnum++;
		}
	}
	
	public static void main(String[] arg){
		CodingTest_5 codingtest= new CodingTest_5();
		codingtest.checkfirst5(1);
	}
}
