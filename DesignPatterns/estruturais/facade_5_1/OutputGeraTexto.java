package facade_5_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class OutputGeraTexto extends FactoryMethodArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputTexto();
	}

}
