public class Pessoa {
  private String Nome;
  private String Idade;
  private String Altura;
// construtor da classe
  public Pessoa(){
    Nome="";
    Idade="";
    Altura="";
  }
// métodos GET da classe obrigatório
  public String getNome(){
    return Nome;
  }
  public String getIdade(){
    return Idade;
  }
  public String getAltura(){
    return Altura;
  }
// método SET da classe obrigatória
  public void setNome(String n){
    Nome=n;
  }
  public void setIdade(String i){
    Idade=i;
  }
  public void setAltura(String a){
    Altura=a;
  }
// método que imprimi as informações da classe.
  public String toString(){
    return "Nome: " + this.Nome + " Idade: " + this.Idade + " Altura " + this.Altura;
  }
  
  }