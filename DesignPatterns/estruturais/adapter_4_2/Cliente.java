package adapter_4_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class Cliente {
	private SomadorEsperado somador;

	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}

	public void executar() {
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}

