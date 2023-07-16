public class Cliente {
	private String nome;
	private String tel;
	private Endereco endereco;
	
	public Cliente (String nome,String tel, Endereco endereco) {
		this.nome = nome;
		this.tel = tel;
		this.endereco = endereco;
	}

	//Metodos (na sequencia das variaveis)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String toString() {
		return endereco.getRua() +", nº " + endereco.getNum() +", "+ endereco.getBairro() + ", Próximo a " + endereco.getPontoRef();
	}
	
	
}