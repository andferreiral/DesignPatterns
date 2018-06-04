package singleton_2;

public class SingletonExercise {
	public static void main(String args[]) {
		/*Deck deck = new Deck();
		deck.print();*/
		
		DeckSingleton singleton = DeckSingleton.getInstance();
		singleton.print();
	}
}
