package observer_8_2;

import observer_8_1.ConsomeNoticia;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class AgregadorTopico extends Agregador {
	
	private String topico;
	private String noticias;
	private int cont;
	
	public AgregadorTopico(String topico) {
		this.topico = topico;
		this.setCont(0);
		this.setNoticias("AGREGADO DE: " + this.topico + ": ");
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		
		if (this.topico.equals(topico)) {
			textoNoticia += "\n";
			this.setNoticias(this.getNoticias() + textoNoticia);
			this.setCont(this.getCont() + 1);
		}
		
		if (this.getCont() == 10) {
			this.setCont(0);
			for (ConsomeNoticia assinante : assinantes) {
				assinante.notificaNoticia(this.noticias, dia, mes, topico);
			}
			this.setNoticias("AGREGADO DE: " + this.topico + ": ");
		}		
	}

	public String getNoticias() {
		return noticias;
	}

	public void setNoticias(String noticias) {
		this.noticias = noticias;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
}
