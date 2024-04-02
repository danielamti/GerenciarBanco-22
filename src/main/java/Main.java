import java.util.Scanner;


public class Main {

  public static void main(String[] args) {      

    menu();
  }


  public static void menu(){    
    Banco bank = new Banco();
    Scanner ler = new Scanner(System.in);
    // cadastro
    System.out.println("Olá bem vindo ao  MarxBank\n\n");
    System.out.println("Insira seu nome: ");
    bank.setNome(ler.nextLine());
    System.out.println("Insira o sombrenome: ");
    bank.setSobrenome(ler.nextLine());
    System.out.println("Insira o CPF: ");
    bank.setCpf(ler.nextLine());
    System.out.println("Obrigado pelo cadastro "+ bank.getNome());


    //cadastro fim




    int indicador;
    indicador = 0;  

    System.out.println("Ola "+ bank.getNome());
    System.out.println("Escolha uma das opções:\n1 - Saldo\n2 - Deposito\n3 - Saque\n4 - Sair");
    while (indicador != 4){
    indicador = ler.nextInt();

    switch (indicador){
      case 1:
        System.out.println("Seu saldo é de R$ "+ bank.getSaldo());
        break;
      case 2:
        System.out.println("Insira um valor de depósito: R$ ");
        bank.setSaldo(ler.nextFloat() + bank.getSaldo());
        System.out.println("Seu saldo agora é R$ "+ bank.getSaldo());
        break;
      case 3:
        float saque;
        System.out.println("Insira o valor do Saque: ");
        saque = ler.nextFloat();
        if (bank.getSaldo() >= saque){
          bank.setSaldo(bank.getSaldo() - saque);
          System.out.println("Seu saldo atual é R$ "+ bank.getSaldo());
        }else{
          System.out.println("Saldo Insuficiente");

        }
          break;
       case 4:
        break;

    }
      }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}