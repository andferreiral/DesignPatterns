package templateMethod_7_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public abstract class TransformaTexto {
	
	public final void transformaTexto() throws IOException{
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite uma texto: ");
		String texto = leitor.readLine();
		
		System.out.println("TRANSFORMADO: " + capturaTexto(texto));
	}

	protected abstract String capturaTexto(String texto);


}
