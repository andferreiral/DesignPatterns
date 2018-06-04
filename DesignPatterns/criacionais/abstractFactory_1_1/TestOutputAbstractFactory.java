package abstractFactory_1_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestOutputAbstractFactory {

	public static void main(String[] args) {
		
		AbstractOutputFactory fabrica = new OutputFactory();
		
		//gera na tela
		OutputType output = fabrica.getOutputType("TELA");
		System.out.println(output.output());
		
		//gera um arquivo
		output = fabrica.getOutputType("ARQUIVO");
		System.out.println(output.output());

	}

}
