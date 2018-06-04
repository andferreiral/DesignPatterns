package factoryMethod_2_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogArquivo implements LogOutput {

	@Override
	public String Output(String tipo) {
		if(tipo == "arquivo"){
			String conteudo = contaDez();
			try{
				geraArquivo(conteudo);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		return "ARQUIVO";
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
	
	public void geraArquivo(String conteudo) throws IOException{
		//cria o arquivo
		File file = new File("log.txt");
		
		//verifica se o arquivo já existe
		if(!file.exists()){
				file.createNewFile();
		}
		
		//Escreve o conteúdo no arquivo
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(conteudo);
		bw.close();
	}


}
