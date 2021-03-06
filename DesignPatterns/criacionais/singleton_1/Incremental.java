package singleton_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class Incremental {
	private static int count = 0;
	private int numero;

	public Incremental() {
		numero = ++count;
	}

	public String toString() {
		return "Incremental " + numero;
	}

}
