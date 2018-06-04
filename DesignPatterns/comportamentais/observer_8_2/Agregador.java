package observer_8_2;

import java.util.ArrayList;
import java.util.List;

import observer_8_1.ConsomeNoticia;

public abstract class Agregador implements ConsomeNoticia {
	
	protected List<ConsomeNoticia> assinantes = new ArrayList<>();
	
	public void adiciona(ConsomeNoticia assinante) {
		this.assinantes.add(assinante);
	}
	
	public void remove(ConsomeNoticia assinante) {
		this.assinantes.remove(assinante);
	}
	
}
