package factoryMethod_2_3;

public class LogConsoleOutput extends LogOutputFactory {

	@Override
	protected LogOutput getTipo() {
		return new LogConsole();
	}

}
