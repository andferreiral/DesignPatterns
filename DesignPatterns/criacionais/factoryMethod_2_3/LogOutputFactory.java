package factoryMethod_2_3;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public abstract class LogOutputFactory {

	public void geraLog(String tipo){
		LogOutput log = getTipo();
		String mensagem = log.Output(tipo);
		System.out.println(mensagem);
	}
	
	protected abstract LogOutput getTipo();
}
