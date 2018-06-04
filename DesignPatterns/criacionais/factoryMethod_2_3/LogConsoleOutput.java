package factoryMethod_2_3;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class LogConsoleOutput extends LogOutputFactory {

	@Override
	protected LogOutput getTipo() {
		return new LogConsole();
	}

}
