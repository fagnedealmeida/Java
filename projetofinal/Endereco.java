public class Endereco {
	private String rua;
	private int num;
	private String bairro;
	private String pontoRef;
	
	public Endereco(String rua, int num, String bairro, String pontoRef) {
		super();
		this.rua = rua;
		this.num = num;
		this.bairro = bairro;
		this.pontoRef = pontoRef;
	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getPontoRef() {
		return pontoRef;
	}
	public void setPontoRef(String pontoRef) {
		this.pontoRef = pontoRef;
	}
	
	
}