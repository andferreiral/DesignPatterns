package factoryMethod_2_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class NomeSobrenome implements NameOutputType {

	@Override
	public String output(String nome, String sobrenome) {
		Nome gerado = new Nome();
		gerado.setNome(nome);
		gerado.setSobrenome(sobrenome);
		
		System.out.println("'NOME SOBRENOME' = " + gerado.getNome() + " " + gerado.getSobrenome());
		
		return "NOME SOBRENOME";
	}

}
