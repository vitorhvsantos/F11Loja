public class Loja {
	private String nome;
	private String cnpj;
	Produto[] produtos;
	private int posLivre = 0;
	private double precoTotal = 0;

	// M�todo Construtor
	public Loja(String nome, String cpnj) {
		this.nome = nome;
		this.cnpj = cpnj;
	}

	// M�todos Getters
	public String getNome() {
		return nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	// Metodos para adicionar os Objetovs de produtos dentro de um array
	public void adicionaProdutos(Produto p) {
		if (posLivre < produtos.length) {
			this.produtos[posLivre] = p;
			// precoTotal += produtos[posLivre].getValor();
			posLivre++;
		} else {
			System.out.println("N�o � possivel adicionar mais produtos");
		}

	}

	// Mostrar o nome e o valor do produto
	public void mostraProduto() {
		System.out.println(getNome());
		System.out.println(getCnpj() + "\n");
		for (int i = 0; i < this.posLivre; i++) {
			produtos[i].mostra();
		}

	}

	// Mostra o valor total de produtos de um objeto
	public void mostraValorTotal() {
		for (int i = 0; i < this.posLivre; i++) {
			precoTotal += produtos[i].getValor();
		}

		System.out.println("\nPre�o Total: " + precoTotal);
		precoTotal = 0;
	}

}
