package factoryMethod_2_1;

public class ImprimeSobrenomeNome extends ImprimeNomes {

	@Override
	protected NameOutputType getTipo() {
		return new SobrenomeNome();
	}

}
