package chain_of_responsability_9_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public interface SlotChain {
	
	void setNextChain(SlotChain next);
	void calcula(Moeda moeda, Produto produto);

}
