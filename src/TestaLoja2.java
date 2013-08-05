public class TestaLoja2 {
	public static void main(String[] args) {

		Loja loja2 = new Loja("Perfumaria 2000", "20202020/001");
		loja2.produtos = new Produto[3];

		loja2.produtos[0] = new Brinquedos("Boneco Superman: ", 10.5);
		loja2.produtos[1] = new Perecivel("Feijão ", 3.5);
		loja2.produtos[2] = new Limpeza("Detergente ", 1.5);

		loja2.adicionaProdutos(loja2.produtos[0]);
		loja2.adicionaProdutos(loja2.produtos[1]);
		loja2.adicionaProdutos(loja2.produtos[2]);

		loja2.mostraProduto();
		loja2.mostraValorTotal();

		for (int i = 0; i < loja2.produtos.length; i++) {
			loja2.produtos[i].recebeAumento();
		}

		System.out.println(" \nApós o Aumento de 10% \n");
		loja2.mostraProduto();
		loja2.mostraValorTotal();

	}

}
