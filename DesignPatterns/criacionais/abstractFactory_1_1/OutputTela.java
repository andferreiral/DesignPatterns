package abstractFactory_1_1;

public class OutputTela  implements OutputType{

	@Override
	public String output() {
		System.out.println("Escrevendo na tela...");
		return "Hello World!";
	}

}
