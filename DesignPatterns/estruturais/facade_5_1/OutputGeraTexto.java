package facade_5_1;

public class OutputGeraTexto extends FactoryMethodArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputTexto();
	}

}
