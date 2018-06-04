package chain_of_responsability_9_2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class TestHandlerChain {

	public static void main(String[] args) {

		HandlerChain handler1 = new Handler(1);
		HandlerChain handler2 = new Handler(2);

		handler1.setNextChain(handler2);
		handler2.setNextChain(handler2);

		// 5 requisições
		for (int i = 0; i < 5; i++) {
			handler1.handleRequest(ThreadLocalRandom.current().nextInt(0, 10000 + 1));
		}
		
		// Espera 1 segundo
		try {
			TimeUnit.SECONDS.sleep(1);
			System.out.println();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Outras 16 requisiçoes (todos irão ficar ocupados e a última será cancelada
		for (int i = 0; i < 16; i++) {
			handler1.handleRequest(ThreadLocalRandom.current().nextInt(0, 10000 + 1));
		}

	}

}
