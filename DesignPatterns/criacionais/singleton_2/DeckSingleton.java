package singleton_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class DeckSingleton {

	private static DeckSingleton instance;
	private List<Card> cards;

	public DeckSingleton() {
		cards = new ArrayList<Card>();
		// build the deck
		Suit[] suits = { Suit.SPADES, Suit.HEARTS, Suit.CLUBS, Suit.DIAMONDS };
		for (Suit suit : suits) {
			for (int i = 2; i <= 14; i++) {
				cards.add(new Card(suit, i));
			}
		}
		// shuffle it!
		Collections.shuffle(cards, new Random());
	}

	public void print() {
		for (Card card : cards) {
			card.print();
		}
	}
	
	// lazy singleton com double ckeck
	public static DeckSingleton getInstance(){
		if (instance == null){
			synchronized(DeckSingleton.class){
				if(instance == null){
					instance = new DeckSingleton();
				}
			}
			
		}
		return instance;
	}

}
