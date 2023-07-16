import java.util.Scanner;

class Main {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);

    System.out.println("Digite a primeira nota: ");
    double nota1 = input.nextDouble();

    System.out.println("Digite a segunda nota: ");
    double nota2 = input.nextDouble();

    double media = (nota1 + nota2) / 2;

    System.out.print("A média do aluno é: " + media);


  }
}