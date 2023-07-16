 public class Conta{
  private int numero;
  private float saldo;
/* na composição é possivel  criar variaveis do tipo de uma classe existente*/
  private Pessoa nome;

/* no construtor da superclasse, quando há composição deve-se exister as variaveis da classe da composição. Podendo ainda colocar todos as variavieis dessa classe de composição.*/
  public Conta(int numero, float saldo, Pessoa nome){
    super();
    this.numero = numero;
    this.saldo = saldo;
    this.nome = nome;
  }
/* construtor alternativo informando os atributos de pessoa e não a classe pessoa*/
  public Conta(int numero, float saldo, String nome, int id){
    super();
    this.numero = numero;
    this.saldo = saldo;
    this.nome = new Pessoa(nome, id);
  }

  public void setNumero(int numero){
    this.numero = numero;
  }

  public int getNumero(){
    return numero;
  }

  public void setSaldo( float saldo){
    this.saldo = saldo;
  }

  public float getSaldo(){
    return saldo;
  }

  public String toString(){
    return "Numero: "+numero+" Saldo: "+saldo+ " Pessoa: "+ nome;
  }

  public void  imprimir(){
    System.out.println(toString());
  }

}