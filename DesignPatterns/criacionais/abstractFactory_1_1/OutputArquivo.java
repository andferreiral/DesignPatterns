package abstractFactory_1_1;

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
public class OutputArquivo implements OutputType {

	@Override
	public String output() {
		System.out.println("Escrevendo arquivo... ");
		try {
			criaArquivo();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "ARQUIVO GERADO! \nATUALIZE ESTE PROJETO";
	}
	
	private void criaArquivo() throws IOException{
		String conteudo = "Hello World!";
		//cria o arquivo
		File file = new File("output.txt");
		
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
