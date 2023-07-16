public class Professor extends Pessoa{
  private String especialidade;
  private float salario;

  public void receberAumento(float aumento){
    this.salario += aumento;
  }

  public void setEspecialidad(String especialidade){
    this.especialidade = especialidade;
  }

  public void setSalario(float Salario){
    this.salario = salario;
  }

  public String getEspecialidade(){
    return especialidade;
  }

  public float getSalario(){
    return salario;
  }


}