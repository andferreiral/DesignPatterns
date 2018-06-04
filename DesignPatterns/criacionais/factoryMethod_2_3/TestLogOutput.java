package factoryMethod_2_3;

public class TestLogOutput {

	public static void main(String[] args) {
		
		//imprime contador pelo console
		LogOutputFactory fabrica = new LogConsoleOutput();
		fabrica.geraLog("console");
		
		//gera arquivo com o contador
		fabrica = new LogArquivoOutput();
		fabrica.geraLog("arquivo");

	}

}
