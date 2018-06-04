package templateMethod_7_1;

public class TextoMinusculo extends TransformaTexto {

	@Override
	protected String capturaTexto(String texto) {
		return texto.toLowerCase();
	}

}
