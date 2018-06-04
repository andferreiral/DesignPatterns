package singleton_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class SingletonExercise {
	public static void main(String args[]) {
		/*Deck deck = new Deck();
		deck.print();*/
		
		DeckSingleton singleton = DeckSingleton.getInstance();
		singleton.print();
	}
}
