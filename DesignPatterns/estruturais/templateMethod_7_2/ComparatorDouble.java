package templateMethod_7_2;

import java.util.Comparator;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1z = d1 - Math.floor(d1);
		Double d2z = d2 - Math.floor(d2);
		return d1z.compareTo(d2z);
	}
}
