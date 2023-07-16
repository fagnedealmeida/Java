public class Peixe extendes Animal{
  private String corEscama;

  @Override
  public void locomover(){
    System.out.println("Nadando");
  }  
  @Override
  public void alimentar(){
    System.out.prinln("Comendo Substancias");
  }
  @Override
  public void emitirSom(){
    System.out.prinln("Peixe não emite som");
  }
  public void soltarBolhas(){
    System.out.prinln("Soltou uma bolha");
  }
}