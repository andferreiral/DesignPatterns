package factoryMethod_2_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class Nome {
	private String nome;
	private String sobrenome;
	
	public Nome(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Nome(){
		
	}
	
	public String getNome(){
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Nome [nome=" + nome + ", sobrenome=" + sobrenome + "]";
	}
	
}
