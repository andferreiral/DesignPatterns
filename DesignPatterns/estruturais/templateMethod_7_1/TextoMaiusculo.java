package templateMethod_7_1;

public class TextoMaiusculo extends TransformaTexto {

	@Override
	protected String capturaTexto(String texto) {
		return texto.toUpperCase();
	}

}
