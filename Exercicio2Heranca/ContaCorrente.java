public class ContaCorrente extends Conta{
  private float limite;

  public ContaCorrente(int numero, float saldo, Pessoa nome, float limite){
    super(numero, saldo, nome);
    this.limite = limite;
  }

  public void setLimite(float limite){
    this.limite = limite;
  }

  public float getLimite(){
    return limite;
  }

  public void imprimir(){
    System.out.println("impressão de CC: \n limite" + this.limite);
    System.out.println("Numero :"+ getNumero()+ "\n Valor: " + getSaldo())
  }
  
}

