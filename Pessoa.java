public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private Cachorro cachorro;
	
	public Pessoa(String n, int i, double a, Cachorro c) {
		this.nome = n;
		this.idade = i;
		this.altura = a;
		this.cachorro = c;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public double getAltura() {
		return altura;
	}
	
	public Cachorro getCachorro() {
		return cachorro;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nidade: " + this.idade + "anos\nAltura: " + this.altura + "m\n"
				+ "Cachorro" + cachorro.toString();
	}
}
