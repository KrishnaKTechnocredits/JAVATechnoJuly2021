package avinash;

public class Assignment_6 {

	void simpleInterest() {
		float p, t, r, si;
		p = 13000;
		r = 12;
		t = 2;
		si = (p * r * t) / 100;
		System.out.println("Simple interest is:" + si);
	}

	void farenhitToCelsius() {
		float fahrenhit, celsius;
		fahrenhit = 23;
		celsius = ((fahrenhit - 32) * 5) / 9;
		System.out.println("Farenhit is:" + fahrenhit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.simpleInterest();
		assignment_6.farenhitToCelsius();
	}

}
