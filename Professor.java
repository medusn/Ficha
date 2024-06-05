public class Professor {
	private String nome;
	private String departamento;
	private String titulacao;
	private Data dataDeNasc;
	
	public Professor(String n, String d, String t, Data dn) {
		this.nome = n;
		this.departamento = d;
		this.titulacao = t;
		this.dataDeNasc = dn;
	}

	public String getNome() {
		return nome;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public String getTitulacao() {
		return titulacao;
	}

	public Data getDataDeNasc() {
		return dataDeNasc;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public void setDataDeNasc(Data dataDeNasc) {
		this.dataDeNasc = dataDeNasc;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nDepartamento: " + this.departamento + "\n"
				+ "Titulação: " + this.titulacao + "\nData de nascimento: " + dataDeNasc.toString();
	}
}

