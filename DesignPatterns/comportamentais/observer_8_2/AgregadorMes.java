package observer_8_2;

import observer_8_1.ConsomeNoticia;

public class AgregadorMes extends Agregador {

	private String noticias;
	private int mes;

	public AgregadorMes() {
		this.setNoticias("AGREGADO DO MÊS: ");
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		if (this.getNoticias().equals("AGREGADO DO MÊS: ")) {
			this.mes = mes;
		}
		if (this.mes == mes) {
			textoNoticia += "\n";
			this.setNoticias(this.getNoticias() + textoNoticia);
		} else {
			this.setMes(mes);
			for (ConsomeNoticia assinante : assinantes) {
				assinante.notificaNoticia(this.noticias, 0, mes, "Mensal");
			}
			this.setNoticias("AGREGADO DO MÊS: ");
		}
	}

	public String getNoticias() {
		return noticias;
	}

	public void setNoticias(String noticias) {
		this.noticias = noticias;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

}