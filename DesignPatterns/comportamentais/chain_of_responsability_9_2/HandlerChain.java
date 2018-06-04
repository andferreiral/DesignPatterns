package chain_of_responsability_9_2;

public interface HandlerChain {
	
	void setNextChain(HandlerChain next);
	void handleRequest(int requisicao);

}
