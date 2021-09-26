package technocredits1.multithreading;

public class Employee1 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		m1();
		m2();
	}
	
	
	static void m1() {
		for(int index=1;index<=100;index++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + index);
		}
	}
	
	static void m2() {
		for(int index=1;index<=100;index++) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("****" + ":" + index);
		}
	}
}
