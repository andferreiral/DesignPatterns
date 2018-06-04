package factoryMethod_2_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class ImprimeSobrenomeNome extends ImprimeNomes {

	@Override
	protected NameOutputType getTipo() {
		return new SobrenomeNome();
	}

}
