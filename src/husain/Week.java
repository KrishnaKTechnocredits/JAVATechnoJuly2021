package husain;

class Week {

	void day(int dayIndex) {
		if (dayIndex >= 1 && dayIndex <= 5) {
			System.out.println("This is a weekday");
		} else if (dayIndex == 6 || dayIndex == 7) {
			System.out.println("This is a weekend");
		} else {
			System.out.println("Invalid index");
		}
	}

	public static void main(String[] args) {
		Week week = new Week();
		week.day(3);
		week.day(6);
		week.day(11);
		week.day(-3);
	}
}