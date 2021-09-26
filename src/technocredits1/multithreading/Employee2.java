package technocredits1.multithreading;

public class Employee2 extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		m1();
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
}
