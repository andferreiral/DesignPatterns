package observer_8_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class NoticiarioAssina extends Noticiario {
	
	private List<ConsomeNoticia> leitores = new ArrayList<>();
	
	public void adicionaConsumidor(ConsomeNoticia leitor) {
		this.leitores.add(leitor);
	}
	
	public void removeConsumidor(ConsomeNoticia leitor) {
		this.leitores.remove(leitor);
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		for (ConsomeNoticia leitor : this.leitores) {
			leitor.notificaNoticia(textoNoticia, dia, mes, topico);
		}
	}
}