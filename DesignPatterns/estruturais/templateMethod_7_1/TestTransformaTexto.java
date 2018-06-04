package templateMethod_7_1;

import java.io.IOException;

public class TestTransformaTexto {
	public static void main(String[] args) throws IOException{
		TransformaTexto transformador;
		
		//maiúsculo
		transformador = new TextoMaiusculo();
		transformador.transformaTexto();
		
		//minúsculo
		transformador = new TextoMinusculo();
		transformador.transformaTexto();
		
		//duplicado
		transformador = new TextoDuplicado();
		transformador.transformaTexto();
		
		//invertido
		transformador = new TextoInvertido();
		transformador.transformaTexto();
		
	}

}
