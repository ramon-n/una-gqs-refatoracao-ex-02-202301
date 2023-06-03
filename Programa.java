import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean executar = true;

    while (executar) {
    System.out.print("Informe a idade do cliente: ");
    int idade = scanner.nextInt();

    System.out.print("Informe o sexo do cliente (M/F): ");
    String sexo = scanner.next();

    double mensalidade;

    if (sexo.equalsIgnoreCase("M")) {
      if (idade <= 15) {
        mensalidade = 60.0;
      } else if (idade >= 16 && idade <= 18) {
        mensalidade = 75.0;
      } else if (idade >= 19 && idade <= 30) {
        mensalidade = 90.0;
      } else if (idade >= 31 && idade <= 40) {
        mensalidade = 85.0;
      } else if (idade >= 41 && idade <= 50) {
        mensalidade = 80.0;
      } else {
        mensalidade = 60.0;
      }
    } else if (sexo.equalsIgnoreCase("F")) {
      if (idade <= 18) {
        mensalidade = 60.0;
      } else if (idade >= 19 && idade <= 25) {
        mensalidade = 90.0;
      } else if (idade >= 26 && idade <= 40) {
        mensalidade = 85.0;
      } else if (idade >= 41 && idade <= 50) {
        mensalidade = 65.0;
      } else {
        mensalidade = 50.0;
      }
    } else {
      System.out.println("Sexo inválido.");
      mensalidade = 0.0;
    }

    System.out.println("Valor da mensalidade: R$" + mensalidade);

    System.out.print("Deseja fazer outro cálculo? (S/N): ");
    String resposta = scanner.next();
    if (!resposta.equalsIgnoreCase("S")) {
      executar = false;
    }
  }

    scanner.close();
  }
}