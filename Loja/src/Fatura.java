public class Fatura {
  private String numero;
  private String descricao;
  private int qntd;
  private double preco;

  //Contruct que chama métodos criados dentro da classe
  Fatura(String number, String descriptioon, int qntd, double price) {
    setNumero(number);
    setDescricao(descriptioon);
    setQntd(qntd);
    setPreco(price);
  }


  public void setNumero(String numero) {
    this.numero = numero;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  // Método set da Quantidade que faz a verificação se a quantidade for negativa e altera ela para 0
  public void setQntd(int qntd) {
    if(qntd < 0){
      this.qntd = 0;
    }else{
      this.qntd = qntd;
    }
  }
  
  // Método set de Preço que faz a verificação se o valor do Preço for negativa e altera ela para 0
  public void setPreco(double preco) {
    if(preco < 0.0){
      this.preco = 0;
    }else{
      this.preco = preco;
    }
  }

  public String getNumero() {
    return numero;
  }

  public String getDescricao() {
    return descricao;
  }

  public int getQntd() {
    return qntd;
  }

  public double getPreco() {
    return preco;
  }

  public double getTotalFatura(){
    double totalFatura = getPreco() * getQntd();
    return totalFatura;
  }

}
