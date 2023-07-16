import java.util.Scanner;

Scanner input = New Scanner(System.in);

String produto;
float custo;
float venda;
float mcusto = 0.0f;
float mvenda = 0.0f;

for (int i = 0; i <= 40; i++){
  System.out.println("Produto: ");
  produto = input.next();
  System.out.println("Custo ");
  custo = input.next();
  System.out.println("Venda: ");
  venda = input.next();

  mcusto = mcusto + custo;
  mvenda = mvenda + venda;

  if(custo == venda){
    // empate
  }else{
    if (custo > venda) {
      // prejuizo
    }else{
      // lucro
    }
  }

  
  
}
  