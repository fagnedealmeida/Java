import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
// constrututores dos objetos
  Pessoa p1= new Pessoa();
  Pessoa p2= new Pessoa();
  Pessoa p3= new Pessoa();
// instanciar objeto 1
  p1.setNome("Fagne");
  p1.setIdade("25");
  p1.setAltura("1.80");
//instanciar objeto 2
  p2.setNome("Iracy");
  p2.setIdade("23");
  p2.setAltura("1.59");
//instanciar objeto 3
  p3.setNome("Laura");
  p3.setIdade("50");
  p3.setAltura("1.60");
//print do nome de p1
  System.out.println("Nome: "+ p1.getNome());
// printando informações pelo método.
  System.out.println(p1.toString());
  System.out.println(p2.toString());
  System.out.println(p3.toString());
// adicionar as informações de cada pessoa em um vetor.
  List<String> Pessoas = new ArrayList<String>();
  Pessoas.add("Oi");
  System.out.println(Pessoas);
  Pessoas.add(p2);



  
  

  }
}