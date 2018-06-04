package facade_5_1;

public class OutputGeraBinario extends FactoryMethodArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputBinario();
	}

}
