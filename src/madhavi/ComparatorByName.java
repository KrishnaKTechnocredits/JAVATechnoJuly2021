package madhavi;

import java.util.Comparator;

public class ComparatorByName implements Comparator<BuilderComparator> {

		@Override
		public int compare(BuilderComparator object1, BuilderComparator object2) {
			// TODO Auto-generated method stub
			return object2.totalCompletedProject - object1.totalCompletedProject;
		}

	}

