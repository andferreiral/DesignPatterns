package observer_8_2;

import observer_8_1.ConsomeNoticia;

public class Publicador implements ConsomeNoticia {

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("TÓPICO: " + topico + ", DATA: " + dia + "/" + mes);
		System.out.println(textoNoticia + "\n");
	}

}