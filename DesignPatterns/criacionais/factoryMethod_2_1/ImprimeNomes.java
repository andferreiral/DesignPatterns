package factoryMethod_2_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public abstract class ImprimeNomes {
	
	public void imprime(Nome nome){
		NameOutputType tipo = getTipo();
		String printa = tipo.output(nome.getNome(), nome.getSobrenome());
		System.out.println(printa);
	}
	
	protected abstract NameOutputType getTipo();
}
