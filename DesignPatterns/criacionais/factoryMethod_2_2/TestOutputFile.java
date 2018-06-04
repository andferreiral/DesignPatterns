package factoryMethod_2_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestOutputFile {

	public static void main(String[] args) {
		
		//gera arquivo público
		ProvedorArquivo service = new OutputPublicoGera();
		service.geraArquivo("");
		
		//gera arquivo confidencial com senha errada
		service = new OutputConfidencialGera();
		service.geraArquivo("senha");
		
		//gera arquivo confidencial com senha certa
		service = new OutputConfidencialGera();
		service.geraArquivo("desi gnpatt er ns");

	}

}
