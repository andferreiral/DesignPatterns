package adapter_4_2;

public class TestCliente {

	public static void main(String[] args){
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
