package observer_8_2;

import observer_8_1.ConsomeNoticia;
import observer_8_1.NoticiarioAssina;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestObserver {
	public static void main(String[] args) {

		NoticiarioAssina noticiario = new NoticiarioAssina();
		ConsomeNoticia publicador = new Publicador();
		Agregador topico = new AgregadorTopico("Programação");
		Agregador mes = new AgregadorMes();

		noticiario.adicionaConsumidor(publicador);
		noticiario.adicionaConsumidor(topico);
		noticiario.adicionaConsumidor(mes);

		topico.adiciona(publicador);
		mes.adiciona(publicador);

		noticiario.notificaNoticia("Greve de caminhoneiros", 4, 6, "Política");
		noticiario.notificaNoticia("Incêndio em prédio em SP", 3, 6, "Urgente!");
		noticiario.notificaNoticia("Marcha para Jesus", 2, 6, "Entretenimento");

	}
}
