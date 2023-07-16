public class Elevador{
  private int capTotal;
  private int qtPessoas;
  private int totalAndar;
  private int andarAtual;

//método construtor.
//método set e get das variáveis.
  
/* condições para o método sobe, quando o elevador pode subir. 
verdadeir ou falso para subir.
condição OU é representada por || */
  public boolean sobe(int andar){
    if (andar > totalAndar || andar<=andar){
      return false;
    }
     else
      andarAtual=andar;	
      return true; 
  }

/* mesma condição do caso subir*/
  public boolean desce(int andar){
    if (andar < totalAndar || andar>=andar){
      return false;
    }
     else
      andarAtual=andar;	
      return true; 
  }

/* condição para que posso entrar alguém no elevador
com o incremento da pessoa ao entrar*/
  public boolean entrar(){
    if (this.qtPessoas<this.capTotal){
      this.qtPessoas++;
      return true;
    }
    else{
      return false;
    }
    }
/*condição para saída do elevador */
   public boolean sair(){
    if (this.qtPessoas>0){
      this.qtPessoas--;
      return true;
    }
    else{
      return false; 
}
