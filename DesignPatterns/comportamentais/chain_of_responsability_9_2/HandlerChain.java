package chain_of_responsability_9_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public interface HandlerChain {
	
	void setNextChain(HandlerChain next);
	void handleRequest(int requisicao);

}
