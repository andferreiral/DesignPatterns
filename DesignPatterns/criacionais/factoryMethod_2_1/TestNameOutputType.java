package factoryMethod_2_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestNameOutputType {

	public static void main(String[] args) {
		Nome andrey = new Nome("Andrey", "Ferreira");
		Nome bonato = new Nome("Sergio", "Bonato");
		
		
		ImprimeNomes service = new ImprimeNomeSobrenome();
		service.imprime(andrey);
		
		service = new ImprimeSobrenomeNome();
		service.imprime(bonato);

	}

}
