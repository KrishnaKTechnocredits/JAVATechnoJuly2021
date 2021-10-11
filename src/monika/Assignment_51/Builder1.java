package monika.Assignment_51;

import java.util.Comparator;

public class Builder1 implements Comparator<Builders> {

	@Override
	public int compare(Builders o1, Builders o2) {
		// TODO Auto-generated method stub
		return o1.revenue - o2.revenue;
	}

}
