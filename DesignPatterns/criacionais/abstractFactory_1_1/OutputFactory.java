package abstractFactory_1_1;

public class OutputFactory implements AbstractOutputFactory {

	@Override
	public OutputType getOutputType(String type) {
		switch(type){
		case "TELA": return new OutputTela();
		case "ARQUIVO": return new OutputArquivo();
		}
		return null;
	}

}
