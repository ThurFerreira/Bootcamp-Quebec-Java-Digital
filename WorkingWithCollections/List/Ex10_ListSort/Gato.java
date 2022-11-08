package WorkingWithCollections.List.Ex10_ListSort;

public class Gato implements Comparable<Gato>{
	
	private String nome;
	private int idade;
	private String cor;
	
	public Gato(String nome, int idade, String cor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override //serve para ao invés de imprimir o endereço de memória, imprimir o dado
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + "]";
	}

	@Override
	public int compareTo(Gato gato) {
		
		return this.getNome().compareToIgnoreCase(gato.getNome());
	}
	
	
}
