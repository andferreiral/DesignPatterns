package factoryMethod_2_1;

public class ImprimeNomeSobrenome extends ImprimeNomes {

	@Override
	protected NameOutputType getTipo() {
		return new NomeSobrenome();
	}

}
