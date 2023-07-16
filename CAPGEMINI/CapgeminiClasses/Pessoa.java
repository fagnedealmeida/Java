public class Pessoa{
  private float peso;
  private float altura;

  //métodos geters e settes.
  public Pessoa(float altura, float peso){
    this.altura = altura;
    this.peso = peso;
  }

  public float getPeso(){
    return peso;
    
  }
 
  public float getAltura(){
    return altura;
    
  }

  public void setPeso(float peso){
    this.peso = peso;
    
  }
  public void setAltura(float altura){
    this.altura = altura;
    
  }
/* o método que retorna alguma valor terá que ser identificado com o tipo de dado do método */
  public float calcularIMC(){
    float imc = peso/(altura*altura);
    return imc;
  }
}
