package adapter_4_1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMapAdapter<C> extends HashMap<C, C> implements Map<C, C>, Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	public HashMapAdapter() {
		super();
	}

	public HashMapAdapter(int capacidade) throws IllegalArgumentException {
		super(capacidade);
	}

	public HashMapAdapter(int capacidade, float fator) throws IllegalArgumentException {
		super(capacidade, fator);
	}

	public HashMapAdapter(C[][] matriz) throws IllegalArgumentException, NullPointerException {
		super();

		if (matriz == null) {
			throw new NullPointerException("Matriz nula");
		}
		if (matriz.length != 2) {
			throw new IllegalArgumentException("Matriz não tem duas linhas");
		}
		if (matriz[0].length != matriz[1].length) {
			throw new IllegalArgumentException("Linhas de comprimento diferente");
		}

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			put(matriz[0][coluna], matriz[1][coluna]);
		}
	}

	public HashMapAdapter(Map<? extends C, ? extends C> map) throws NullPointerException {
		super(map);
	}

}
