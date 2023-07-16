public class Reptil extends Animal{
  privado String corEscama;

  @Override
  public void locomover(){
    System.out.println("Rastejando");
  }
  @Override
  public void alimentar(){
    System.out.prinln("Comendo vegetais");
  }
  @Override
  public void emitirSom(){
    System.out.println("Som de reptil");
  }
}