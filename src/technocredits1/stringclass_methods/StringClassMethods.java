package technocredits1.stringclass_methods;

public class StringClassMethods {
	private static final StringClassMethods s;
	static {
		s = new StringClassMethods();
	}

	public static void main(String[] args) {
		Object s1 = new Student(1, "abc");
		Object s2 = new Student(2, "xyz");
		System.out.println(s2);
		System.out.println(s1);
	}

	static void isEmpty() {
		String str = "true";
		System.out.println(str.isEmpty());
	}

	void contains() {
		String str = "amazon123order";
		System.out.println(str.contains("12"));
	}

	void suffix() {
		// String str = "Amazon123";
		String str = "Amazon123Order";
		// System.out.println(str.startsWith("amazon"));
		System.out.println(str.endsWith("order"));
	}

	void trim() {
		String str = "    a b c d              ";
		System.out.println(str);
		System.out.println(str.trim());
	}

	void compare() {
		String str = "abc";
		String str1 = "123";
		int c = 'A';
		System.out.println(c);

		// 0, +ve or -ve
		// System.out.println(str.compareTo(str1));
		// System.out.println(str.compareTo(str1));
	}
}
