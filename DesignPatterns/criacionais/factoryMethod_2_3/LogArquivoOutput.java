package factoryMethod_2_3;

public class LogArquivoOutput extends LogOutputFactory{

	@Override
	protected LogOutput getTipo() {
		return new LogArquivo();
	}

}
