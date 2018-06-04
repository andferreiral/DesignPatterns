package factoryMethod_2_2;

public class OutputPublicoGera extends ProvedorArquivo {

	@Override
	protected OutputFile getTipo() {
		return new OutputPublico();
	}

}
