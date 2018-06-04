package factoryMethod_2_2;

public class OutputConfidencialGera extends ProvedorArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputConfidencial();
	}

}
