public class ContaPoupanca extends Conta{
  private float taxa;

/* os construtores devem ser iguais tanto na superclasse como na classe filha 
(seja vazio ou preenchido) */

  public ContaPoupanca(int numero, float saldo, Pessoa nome, float taxa){
    super(numero,saldo,nome);
    this.taxa = taxa;
  }

  public void setTaxa(float taxa){
    this.taxa = taxa;
  }

  public float getTaxa(){
    return taxa;
  }

}