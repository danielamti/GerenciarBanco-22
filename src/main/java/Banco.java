import java.util.Scanner;

class Banco {
  private String nome;
  private String sobrenome;
  private String cpf;
  private float saldo;

  Scanner ler = new Scanner(System.in);



public String getNome() {
  return nome;
}
public void setNome(String nome) {
  this.nome = nome;
}
public String getSobrenome() {
  return sobrenome;
}
public void setSobrenome(String sobrenome) {
  this.sobrenome = sobrenome;
}
public String getCpf() {
  return cpf;
}
public void setCpf(String cpf) {
  this.cpf = cpf;
}

  public float getSaldo() {
    return saldo;
  }
  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }



}