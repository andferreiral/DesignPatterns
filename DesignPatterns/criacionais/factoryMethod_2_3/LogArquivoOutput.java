package factoryMethod_2_3;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class LogArquivoOutput extends LogOutputFactory{

	@Override
	protected LogOutput getTipo() {
		return new LogArquivo();
	}

}
