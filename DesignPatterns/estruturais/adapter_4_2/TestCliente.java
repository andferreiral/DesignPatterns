package adapter_4_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestCliente {

	public static void main(String[] args){
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
