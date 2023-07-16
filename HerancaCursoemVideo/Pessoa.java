public abstract class Pessoa{
  private String nome;
  private int idade;
  private String sexo;

  public void fazerAniversario(){
    this.idade ++;
  }

  public void setNome(String nome){
    this.nome = nome;    
  }

  public void setIdade(int idade){
    this.idade = idade;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }

  public String getNome(){
    return nome;
  }

  public String getSexo(){
    return sexo;
  }

  public int getIdade(){
    return idade;
  }

  public String toString(){
    return "Pessoa " + nome + " tem " + idade + " anos" + " e é do sexo " + sexo;
  }

}