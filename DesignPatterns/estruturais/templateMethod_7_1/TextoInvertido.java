package templateMethod_7_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TextoInvertido extends TransformaTexto {

	@Override
	protected String capturaTexto(String texto) {
		StringBuffer buffer = new StringBuffer(texto.length());
		for(int i= texto.length(); i>0; i--){
			buffer.append(texto).charAt(i - 1);
		}
		return buffer.toString();
	}

}
