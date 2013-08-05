public class TestaLoja {
	public static void main(String[] args) {

		Loja loja = new Loja("Perfumaria 2000", "20202020/001");
		loja.produtos = new Produto[3];
		
		loja.produtos[0] = new Brinquedos("Boneco Superman: ", 10.5);
		loja.produtos[1] = new Perecivel("Feijão ", 3.5);
		loja.produtos[2] = new Limpeza("Detergente ", 1.5);

		loja.adicionaProdutos(loja.produtos[0]);
		loja.adicionaProdutos(loja.produtos[1]);
		loja.adicionaProdutos(loja.produtos[2]);

		loja.mostraProduto();
		loja.mostraValorTotal();

	}
}
