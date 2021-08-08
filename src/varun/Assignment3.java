package varun;

class Assignment3 {
	void week(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 5) {
			System.out.println("This is a Weekday");
		} else if (dayIndex >= 6 && dayIndex <= 7) {
			System.out.println("This is a Weekend");
		} else
			System.out.println("You have entered a Invalid Index");
	}

	void browserType(String browserName) {
		if (browserName.equals("Chrome") || browserName.equals("IE") || browserName.equals("Edge")) {
			System.out.println("Valid Browser");
		} else
			System.out.println("Invalid Browser");
	}

	public static void main(String[] args) {
		Assignment3 assignment3 = new Assignment3();
		// Weekdays and Weekend validation
		System.out.println("Weekdays and Weekend validation");
		assignment3.week(3);
		assignment3.week(6);
		assignment3.week(11);
		assignment3.week(-3);
		// Browser validation
		System.out.println("Browser validation");
		assignment3.browserType("Chrome");
		assignment3.browserType("Safari");
		assignment3.browserType("Edge");
		assignment3.browserType("Firefox");
	}
}