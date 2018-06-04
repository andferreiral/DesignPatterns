package templateMethod_7_1;

public class TextoDuplicado extends TransformaTexto{

	@Override
	protected String capturaTexto(String texto) {
		return texto + " " + texto;
	}

}
