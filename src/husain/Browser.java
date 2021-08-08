package husain;

class Browser {

	void browsers(String browserName) {
		if (browserName.equalsIgnoreCase("Chrome") || browserName.equalsIgnoreCase("Edge")
				|| browserName.equalsIgnoreCase("IE")) {
			System.out.println("This is a valid browser");
		} else {
			System.out.println("Invalid browser");
		}
	}

	public static void main(String[] args) {
		Browser browser = new Browser();
		browser.browsers("IE");
		browser.browsers("edge");
		browser.browsers("Safari");

	}
}