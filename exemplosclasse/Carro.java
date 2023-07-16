public class Carro {
  private String placa;
  private String dono;
  private String cor;
  private String apartamento;
  //método construtor
  public Carro(){
    placa="";
    dono="";
    cor="";
    apartamento="";
  }
  //método construtor
  public Carro(String p, String d, String c, String apto){
    placa=p;
    dono=d;
    c=cor;
    apartamento=apto;
  }
  // método getPlaca
  public String getplaca(){
    return placa;
  }  
  // método setPlaca
  void setplaca(String p){
    placa=p;
  }
  // método setDono
  void setdono(String d){
    dono=d;
  }
  // método getDono(
  public String getdono(){
    return dono;
  }
  // método getCor
  public String getcor(){
    return cor;
  }
  //método setCor
  void setcor(String c){
    cor=c;
  }
  // método getApartamento
  public String getapartamento(){
    return apartamento;
  }
  // método setApartamento
  void setapartamento(String apto){
    apartamento=apto;
  }

}