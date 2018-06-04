package abstractFactory_1_2;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class Calzonaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA: case QUARTA: case SEXTA:
			return new CalzoneCalabresa();
		case TERÇA: case QUINTA: case SÁBADO:
			return new CalzonePresunto();
		default:
			System.out.println("Calzonaria Fechada");
			return null;
		}
	}


}
