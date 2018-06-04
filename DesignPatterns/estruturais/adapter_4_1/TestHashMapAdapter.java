package adapter_4_1;

import java.util.Map;
/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestHashMapAdapter {
	public static void main(String[] args){
		//matriz de inteiros
		Integer[][] matriz = new Integer[][]{
			{
				0,1,2,3,4,5,6,7,8,9,10
			},
			{
				2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010
			}
		};
		
		//hashMap que implementa o adapter e passa a matriz no construtor
		Map<Integer, Integer> hashMap = new HashMapAdapter<Integer>(matriz);
		
		//imprime no console chave e valor do mapa
		for(Integer key: hashMap.keySet()){
			System.out.println("Chave= " + key + " : " + hashMap.get(key) + " = Valor");
		}
	}

}
