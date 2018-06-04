package facade_5_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class OutputTexto implements OutputFile {

	@Override
	public String output() {
		try {
			geraArquivoTexto();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "ARQUIVO FACADE 1 - DATA DO SISTEMA";
	}
	
	public void geraArquivoTexto() throws IOException{
		//pega a data atual do sistema
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date data = new Date();
		
		String conteudo = dateFormat.format(data);
		
		//cria o arquivo
		File file = new File("facade_1.txt");
		
		//verifica se o arquivo já existe
		if(!file.exists()){
				file.createNewFile();
		}
		
		//Escreve o conteúdo no arquivo
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("DATA ATUAL: " + conteudo);
		bw.close();
	}

}
