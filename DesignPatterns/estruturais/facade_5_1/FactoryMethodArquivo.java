package facade_5_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public abstract class FactoryMethodArquivo {
	
	public void geraArquivo(){
		OutputFile tipo = getTipo();
		String mensagem =  tipo.output();
		System.out.println(mensagem);
	}
	
	protected abstract OutputFile getTipo();

}
