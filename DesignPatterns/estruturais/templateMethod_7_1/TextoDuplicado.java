package templateMethod_7_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TextoDuplicado extends TransformaTexto{

	@Override
	protected String capturaTexto(String texto) {
		return texto + " " + texto;
	}

}
