public class Pedido {
	private Cliente cliente;
	private double valor;
	private String data;
	private String horario;
	private double frete;
		
	public Pedido (Cliente cliente, double valor, String data, String horario) {
		this.cliente = cliente;
		this.valor = valor;
		this.data = data;
		this.horario = horario;
	}
		
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public void setFrete(double frete) {
		this.frete = frete;
	}
	public double getFrete() {
		return frete;
	}
	
	public String entrega(boolean opcao) {
	if (opcao == true) {
		
		this.setFrete(10.00);
		return "Entrega em: " + cliente.toString();
	}else {
		this.setFrete(0.0);
		return "Pedido para retirada no estabelecimento! ";
	}
	}
	public double totalValor() {
		double totalValor;
		totalValor = getValor() + getFrete();
		return totalValor;
	}

	@Override
	public String toString() {
		return "O pedido de " + cliente.getNome() + " realizado no dia, "+ data +"," + " às "+ horario+ "\nNo valor de: R$"+ getValor()+ "\nTaxa de frete: R$"+getFrete()+"\nTotalizando: R$"+ totalValor();
	}
	
	
}