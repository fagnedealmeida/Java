class Main {
  public static void main(String[] args) {
    
    System.out.println("Pessoa criada....");
    
    Pessoa p1 = new Pessoa(1.70f, 65.0f);
    System.out.println(p1.getAltura());
    System.out.println(p1.getPeso());
    System.out.println(p1.calcularIMC());
    p1.setAltura(1.60f);
    p1.setPeso(63);

    System.out.println("Peso: " + p1.getPeso()+ " Altura "+ p1.getAltura());
    System.out.println(p1.calcularIMC());

  }
}