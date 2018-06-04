package factoryMethod_2_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public abstract class ProvedorArquivo {
	
	public void geraArquivo(String senha){
		OutputFile tipo = getTipo();
		String mensagem =  tipo.output(senha);
		System.out.println(mensagem);
	}
	
	protected abstract OutputFile getTipo();

}
