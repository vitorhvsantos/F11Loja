public abstract class Produto {
	private String nome;
	private double valor;

	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;

	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public void mostra() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Valor do Produto: " + this.valor);
	}

	public void recebeAumento() {
		this.valor += this.valor * 0.1;
	}

}
