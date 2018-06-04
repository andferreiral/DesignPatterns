package facade_5_1;

public class IOFacade {
	
	private FactoryMethodArquivo arquivo_texto, arquivo_binario;
	
	public IOFacade(){
		this.arquivo_texto = new OutputGeraTexto();
		this.arquivo_binario = new OutputGeraBinario();
	}
	
	public void run(){
		arquivo_texto.geraArquivo();
		arquivo_binario.geraArquivo();
	}

}
