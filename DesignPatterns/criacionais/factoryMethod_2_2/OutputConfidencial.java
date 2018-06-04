package factoryMethod_2_2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputConfidencial implements OutputFile {

	@Override
	public String output(String senha) {
		if (senha == "desi gnpatt er ns") {
			try {
				geraArquivoConfidencial();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("SENHA INCORRETA! \nARQUIVO NÃO PÔDE SER GERADO.");
		}
		return "CONFIDENCIAL";
	}

	public void geraArquivoConfidencial() throws IOException {
		String conteudo = "Estas informações são confidenciais, o que significa que provavelmente só você sabe a senha.";
		// cria o arquivo
		File file = new File("confidencial.txt");

		// verifica se o arquivo já existe
		if (!file.exists()) {
			file.createNewFile();
		}

		// Escreve o conteúdo no arquivo
		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write(conteudo);
		bw.close();
	}

}
