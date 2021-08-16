package trupti;

class Assignment2 {

	void findWeekdayAndWeekend(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 5) {
			System.out.println("This is weekday");
		} else if (dayIndex >= 6 && dayIndex <= 7) {
			System.out.println("This is weekend");
		} else if (dayIndex >= 8 || dayIndex <= 0) {
			System.out.println("Invalid Index");
		}
	}

	void validBrowserName(String browser) {
		if (browser.equals("IE") || browser.equals("chrome") || browser.equals("edge")) {
			System.out.println("This is valid browser name");
		} else if (browser.equals("Safari") || browser.equals("FF")) {
			System.out.println("This is invalid browser name");
		}
	}

	public static void main(String[] args) {
		Assignment2 assignment2_1 = new Assignment2();
		assignment2_1.findWeekdayAndWeekend(1);
		assignment2_1.findWeekdayAndWeekend(2);
		assignment2_1.findWeekdayAndWeekend(5);
		assignment2_1.findWeekdayAndWeekend(6);
		assignment2_1.findWeekdayAndWeekend(7);
		assignment2_1.findWeekdayAndWeekend(8);
		assignment2_1.findWeekdayAndWeekend(0);
		assignment2_1.findWeekdayAndWeekend(-9);
		assignment2_1.findWeekdayAndWeekend(-11);

		Assignment2 assignment2_2 = new Assignment2();
		assignment2_2.validBrowserName("chrome");
		assignment2_2.validBrowserName("IE");
		assignment2_2.validBrowserName("Safari");
		assignment2_2.validBrowserName("FF");
		assignment2_2.validBrowserName("edge");

	}
}