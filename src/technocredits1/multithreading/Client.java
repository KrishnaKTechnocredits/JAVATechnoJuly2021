package technocredits1.multithreading;

public class Client {

	/*public static void main(String[] args) throws InterruptedException {
		System.out.println("Hi");
		System.out.println(Thread.currentThread().getName());
		Employee1 emp1 = new Employee1();
		emp1.setName("Maulik");
		emp1.setPriority(2);
		Employee2 emp2 = new Employee2();
		emp2.setName("Krishna");
		emp2.setPriority(10);
		emp1.start();
		emp2.start();
		Thread.sleep(5000);
		System.out.println("Hello");
		//Employee1 emp11 = new Employee1();
		//emp11.start();
	}*/
	
	public static void main(String[] args) {
		Employee1 emp1 = new Employee1();
		Employee2 emp2 = new Employee2();
		
		emp2.run();
		emp1.run();
	}
}
