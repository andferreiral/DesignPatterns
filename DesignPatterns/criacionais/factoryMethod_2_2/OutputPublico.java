package factoryMethod_2_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class OutputPublico implements OutputFile {

	@Override
	public String output(String senha) {
		try {
			geraArquivoPublico();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "PUBLICO";
	}
	
	public void geraArquivoPublico() throws IOException{
		String conteudo = "Estas informações são públicas. Todo mundo pode ver este arquivo.";
		//cria o arquivo
		File file = new File("publico.txt");
		
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
