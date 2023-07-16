public class Conta{
  public int nunConta;
  protected String tipo;
  private String dono;
  private float saldo;
  private boolean status;
/* Métodos específicos da classe*/
  public void abrirConta(String t){
/* para abrir a conta deve saber o tipo da conta 
e as condições para cada tipo, além de mudar o status da conta*/    
    this.setTipo(t);
    this.setStatus(true);
    if (t == "CC"){
      this.setSaldo(50);
      }else if (t == "CP"){
        this.setSaldo(150);
      }
  }
  public void fecharConta(){
  /* verificar as condições para fechar conta,
  apenas com saldo 0*/
    if (this.getSaldo() > 0 ) {
      System.out.println("Conta não pode ser fechada");
    } else if (this.getSaldo() < ) {
      System.out.println("Conta não pode ser fechada com débito")
    } else {
      this.setStatus(false); 
      System.out.println("Conta fechada");
    }

  }
  public void depositar(float v){
/*método para depositar, respeitando a condição de conta 
aberta ou fechada. */
    if (this.getStatus()){
      this.setSaldo(this.getSaldo() + v);
      System.out.println("Depósito feito");
    } else {
      System.out.println("Impossivel depositar em conta fechada");
    }

  }
  public void sacar(float v){
/* verificar os valores para saque, se existe saldo suficiente
e ainda respeitar a condição de status da conta*/
    if (this.getStatus()){
      if (this.getSaldo() >= v){
        this.setSaldo(this.getSaldo()-v);
        System.out.println("Saque feito !");
      } else {
        System.out.println("Saldo insuficiente");
      }
    } else {
      System.out.println("Impossivel saca, conta não existe.");
    }

  }
  public void pagarMensal(){
    int v;
    if (this.getTipo() == "CC"){
      v = 12;
    } else if (this.getTipo() == "CP"){
      v = 20;
    }
    if (this.getStatus()){
      this.setSaldo(this.getSaldo() - v);
      System.out.println("Mensalidade paga");      
    } else {
      System.out.println("Impossivel pagar, conta fechada");
    }

  }

/* Métodos especiais GET e SET e CONSTRUTOR
*/
  public void setnunConta(int conta){
    this.conta = conta;    
  }
  public int getnunConta(){
    return nunConta;
  }
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public String getTipo(){
    return tipo;
  }
  public void setDono(String dono){
    this.dono=dono;
  }
  public String getDono(){
    return dono;
  }
  public void setSaldo(float saldo){
    this.saldo = saldo;
  }
  public float getSaldo(){
    return saldo;
  }
  public void setStatus(boolean status){
    this.status = status;
  }
  public boolean getStatus(){
    return status;
  }

  public Conta(){
    this.saldo=0;
    this.status=false;
  }
}



