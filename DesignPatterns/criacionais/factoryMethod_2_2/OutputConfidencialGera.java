package factoryMethod_2_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class OutputConfidencialGera extends ProvedorArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputConfidencial();
	}

}
