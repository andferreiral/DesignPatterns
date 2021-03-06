package adapter_4_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class SomadorAdapter implements SomadorEsperado {

	private static SomadorExistente somador = new SomadorExistente();
	
	@Override
	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<>();
		for(int i = 0; i <vetor.length; i++){
			lista.add(vetor[i]);
		}
		return somador.somaLista(lista);
	}

}
