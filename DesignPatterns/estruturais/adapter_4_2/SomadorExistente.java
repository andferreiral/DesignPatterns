package adapter_4_2;

import java.util.List;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class SomadorExistente {
	public int somaLista(List<Integer> lista) {
		int resultado = 0;
		for (int i : lista)
			resultado += i;
		return resultado;
	}
}