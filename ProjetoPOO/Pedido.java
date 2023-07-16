public class Pedido {
	private Cliente cliente;
	private double valor;
	private String data;
	private String horario;
	
	public Pedido (Cliente cliente, double valor, String data, String horario) {
		this.cliente = cliente;
		this.valor = valor;
		this.data = data;
		this.horario = horario;
	}

	//Metodos na sequencia das variaveis
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
	public void entrega(String opcao) {
	if (opcao =="SIM" || opcao =="sim") {
		this.setValor(this.getValor() + 10);		
	}else {
		this.getValor();
	}
	}

	@Override
	public String toString() {
		return "O pedido de " + cliente.getNome() + " realizado no dia, "+ data + " às "+ horario+ ", totalizou R$"+ valor +"\nFoi entregue na: " + cliente.toString();
	}
	
	
}
		
