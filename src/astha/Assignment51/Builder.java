package astha.Assignment51;

public class Builder {

		String name, gstNumbber;
		int totalCompletedProject, revenue;

		public Builder(String name, String gstNumbber, int totalCompletedProject, int revenue) {
			this.name = name;
			this.gstNumbber = gstNumbber;
			this.totalCompletedProject = totalCompletedProject;
			this.revenue = revenue;
		}

		@Override
		public String toString() {
			return name + " : " + revenue + " : " + totalCompletedProject;
		}

	}

