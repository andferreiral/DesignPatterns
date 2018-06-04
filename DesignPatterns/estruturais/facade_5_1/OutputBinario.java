package facade_5_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputBinario implements OutputFile {

	@Override
	public String output() {
		try {
			geraArquivoBinario();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "ARQUIVO FACADE 2 - USUÁRIO DO SISTEMA";
	}

	public void geraArquivoBinario() throws IOException {
		// pega o usuario do sistema
		String conteudo = System.getProperty("user.name");
		// cria o arquivo
		File file = new File("facade_2.dat");

		// verifica se o arquivo já existe
		if (!file.exists()) {
			file.createNewFile();
		}
		
		//prepara o arquivo binário que vai receber o  arquivo
		FileOutputStream bin_file = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(bin_file, "UTF-8");
		BufferedWriter out = new BufferedWriter(writer);
		
		//escreve o conteúdo no arquivo binário
		out.write("USUÁRIO: " + conteudo);

		out.flush();
		bin_file.close();

	}

}
