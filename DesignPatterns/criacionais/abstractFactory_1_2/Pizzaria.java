package abstractFactory_1_2;

public class Pizzaria implements AbstractPizzaria {

	@Override
	public Pizza getFactory(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA: case QUARTA: case SEXTA:
			return new PizzaCalabresa();
		case TERÇA: case QUINTA: case SÁBADO:
			return new PizzaPresunto();
		default:
			System.out.println("Pizzaria Fechada");
			return null;
		}
	}

}
