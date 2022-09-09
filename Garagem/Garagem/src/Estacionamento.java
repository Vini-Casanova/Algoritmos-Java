import java.util.ArrayList;
import java.util.List;
public class Estacionamento {
  Veiculos moto = new Veiculos("Moto",1);
  Veiculos carro = new Veiculos("Carro Popular", 2);
  Veiculos picape = new Veiculos("Picape", 4);

  private List<Veiculos> tamanho;
  private int capacidadeUsada;

  Estacionamento(){
    tamanho = new ArrayList<>();
    capacidadeUsada = 0;
  }

  public void Adicionar(int escolha){
    switch (escolha) {
      case 1:
        if(capacidadeUsada +moto.getSize() <=20){
          tamanho.add(moto);
          capacidadeUsada += moto.getSize();
        }else{
          System.out.println("Capacidade Máxima Alcançada");
        }
        break;
      case 2:
        if(capacidadeUsada == 20){
          System.out.println("Capacidade Máxima Alcançada");
        }else if(capacidadeUsada +carro.getSize() <= 20){
          tamanho.add(carro);
          capacidadeUsada += carro.getSize();
        }else{
          System.out.println("Garagem não possui mais espaço para caber "+carro.getName());
        }
        break;
      
      case 3:
        if(capacidadeUsada == 20){
          System.out.println("Capacidade Maxima Alcançada");
        }else if(capacidadeUsada +  picape.getSize() <= 20){
          tamanho.add(picape);
          capacidadeUsada += picape.getSize();
        }else{
          System.out.println("Garagem não possui mais espaço para caber "+picape.getName());
        }
        break;

      default:
      System.out.println("Carro inválido");
        break;
    }
  }

  public int getCapacidadeUsada() {
    return capacidadeUsada;
  }

  public int getTamanho() {
    return tamanho.size();
  }

  public Veiculos getVeiculo(int i){
    return tamanho.get(i);
  }
}