class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();

    p1.setNome("Fagne");
    p2.setNome("Iracy");
    p3.setNome("Amariles");
    p4.setNome("Fufi");

    p3.setSexo("Feminino");
    p4.setSexo("Masculino");

    p3.setIdade(9);
    p4.setIdade(5);
    p1.setIdade(26);
    p2.setIdade(24);
    
    
    System.out.println(p1.toString());
    System.out.println(p2.toString());
    System.out.println(p3.toString());
    System.out.println(p4.toString());
    
  }
}