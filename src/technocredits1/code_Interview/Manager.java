package technocredits1.code_Interview;

public class Manager {
	static int count = 0;
	void m1() {
		Manager mng4 = null;
		for(int index=1;index<=1000000;index++) {
			mng4 = new Manager();	
			//System.gc();
		}
		
		String msg = "technocredits";
		char[] arr = msg.toCharArray();
		System.out.println(arr.length);
		int count = 0;
		while(true) {
			try {
				char ch = msg.charAt(count);
				count++;
			}catch(StringIndexOutOfBoundsException se) {
				break;
			}
		}
		System.out.println(count);
	}
	
	@Override
	public void finalize() {
		System.out.println("**" + count++);
	}
	
	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.m1();
		/*Manager mng1 = new Manager();
		mng1 = null;
		
		Manager mng2 = new Manager();
		Manager mng3 = new Manager();
		mng2 = mng3;
		
		Manager mng4 = null;
		for(int index=1;index<=10000;index++) {
			mng4 = new Manager();	
		}*/
		
	}
}
