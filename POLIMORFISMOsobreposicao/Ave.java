public class Ave extends Animal{
  private String corPena;

  public void fazerNinho(){
    System.out.println("Construiu o ninho");
  }
  @Override
  public void locomover(){
    System.out.prinln("Voando");
  }
  @Override
  public void alimentar(){
    System.out.prinln("Comendo frutas");
    
  }
  @Override
  public void emitirSom(){
    System.out.println("Som de ave");
  }
}