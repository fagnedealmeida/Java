class Main {
  public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Rua de cima", 01, "Malvinas", "Trauma");
		Cliente cliente1 = new Cliente("Fagne", "991521750", endereco1);
		Pedido pedido1 = new Pedido(cliente1, 25, "18/03/2022", "01:20");
		
		Endereco endereco2 = new Endereco("Rua de baixo", 02, "Catolé", "Partage");
		Cliente cliente2 = new Cliente("Thaynara", "986766666", endereco2);
		Pedido pedido2 = new Pedido(cliente2, 100, "17/03/2022", "16:30");
		
		Endereco endereco3 = new Endereco("Rua do meio", 03, "Centro", "Catedral");
		Cliente cliente3 = new Cliente("Aline", "8892838893", endereco3);
		Pedido pedido3 = new Pedido (cliente3, 150, "16/03/2022", "02:15");
		
		
		//método para adicionar o valor de entrega através da condição de string
		pedido1.entrega("não");
		pedido2.entrega("SIM");
		pedido3.entrega("sim");
		
		//exibição dos valores dos pedidos após acréscimos do frete.		
		System.out.println(pedido1.getValor());
		
		System.out.println(pedido2.getValor());
		
		System.out.println(pedido3.getValor());
		
		// exibição do pedido 
		System.out.println("=========================");
		System.out.println(pedido1.toString());
		System.out.println("=========================");
		System.out.println(pedido2.toString());
		System.out.println("=========================");
		System.out.println(pedido3.toString());
		

	}

}

  
  