package chain_of_responsability_9_1;

/**
 * 
 * @author Andrey
 *
 * R.A: 816118662
 */
public class TestaChainOfResponsability {
	public static void main(String[] args) {

		SlotChain chain1cent = new SlotUmCentavo();
		SlotChain chain5cent = new SlotCincoCentavos();
		SlotChain chain10cent = new SlotDezCentavos();
		SlotChain chain25cent = new SlotVinteCincoCentavos();
		SlotChain chain50cent = new SlotCinquentaCentavos();
		SlotChain chain1real = new SlotUmReal();

		chain1cent.setNextChain(chain5cent);
		chain5cent.setNextChain(chain10cent);
		chain10cent.setNextChain(chain25cent);
		chain25cent.setNextChain(chain50cent);
		chain50cent.setNextChain(chain1real);

		Produto suco = new Produto("Suco de laranja", 1.00);
		Produto bolacha = new Produto("Bolacha", 2.50);

		Moeda m1c = new Moeda(0.01);
		Moeda m5c = new Moeda(0.05);
		Moeda m10c = new Moeda(0.10);
		Moeda m25c = new Moeda(0.25);
		Moeda m50c = new Moeda(0.50);
		Moeda m1r = new Moeda(1.00);

		chain1cent.calcula(m5c, suco);
		chain1cent.calcula(m10c, suco);
		chain1cent.calcula(m25c, suco);
		chain1cent.calcula(m25c, suco);
		chain1cent.calcula(m1r, suco);

		chain1cent.calcula(m1c, bolacha);
		chain1cent.calcula(m50c, bolacha);
		chain1cent.calcula(m1r, bolacha);
		chain1cent.calcula(m50c, bolacha);
		chain1cent.calcula(m25c, bolacha);
		chain1cent.calcula(m25c, bolacha);

	}
}
