public class Mamifero extends Animal{
  protected String corPelo;
  @Override
  public void emitirSom(){
    System.out.println("Som de manifero !");
    
  }
  @Override
  public void alimentar(){
    System.out.println("Mamando");
  }

  @Override
  public void locomover(){
    System.out.println("Correndo");
  }
    
}