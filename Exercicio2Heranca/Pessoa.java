public class Pessoa{
  private String nome;
  private int id;
/* construtor de uma classe derivada também existe as variavéis da classe mãe, utilizando o super()*/

  public Pessoa (String nome, int id){
    super();
    this.nome = nome;
    this.id = id;
  }

  public void setId(int id){
    this.id = id;
  }

  public int getId(){
    return id;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }

  public String toString(){
    return "Nome: "+nome+ " Id: "+id;
  }
}