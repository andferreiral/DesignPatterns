package chain_of_responsability_9_1;

public class SlotUmReal implements SlotChain{
	private SlotChain next;

	@Override
	public void setNextChain(SlotChain next) {
		this.next = next;
	}

	@Override
	public void calcula(Moeda moeda, Produto produto) {

		if (moeda.getValor() == 1.00) {
			if (produto.getValorFaltante() - 1.00 > 0) {
				produto.setValorFaltante(produto.getValorFaltante() - 1.00);
				System.out.println("MOEDA DE R$" + moeda.getValor() + " FOI INSERIDA NA MÁQUINA. " + " FALTA: R$" + produto.getValorFaltante());
			} else {
				produto.setValorFaltante(produto.getValorFaltante() - 1.00);
				System.out.println(produto.getNome() + " TROCO: R$" + produto.getValorFaltante() * -1);
			}

		} else {
			next.calcula(moeda, produto);
		}

	}
}
