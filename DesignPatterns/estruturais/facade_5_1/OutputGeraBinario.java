package facade_5_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class OutputGeraBinario extends FactoryMethodArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputBinario();
	}

}
