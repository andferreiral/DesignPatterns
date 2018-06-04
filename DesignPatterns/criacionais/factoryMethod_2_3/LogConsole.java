package factoryMethod_2_3;

public class LogConsole implements LogOutput {

	@Override
	public String Output(String tipo) {
		if(tipo == "console"){
			String saida = contaDez();
			System.out.println(saida);
		}
		return "CONSOLE";
	}

	private String contaDez() {
		String conta = "";
		for(int x = 0; x <= 10; x++){
			if(x == 10){
				conta +=" " + x;
			}else{
				conta +=" " + x + ",";
			}
		}
		return conta;
	}

}
