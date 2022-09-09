import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baaralho {
  List<Cartas> baralho = new ArrayList<>();

  Baaralho(){
    for(int i = 1; i < 53 ;i++) {
      if(i <= 13){
        Cartas carta = new Cartas((i), "Paus");
        baralho.add(carta);
      }else if(i> 13 && i <=26){
        Cartas carta = new Cartas((i-13), "Espadas");
        baralho.add(carta);
      }else if(i>26 && i <=39){
        Cartas carta = new Cartas((i-26), "Copas");
        baralho.add(carta);
      }else if(i>39 && i <=52){
        Cartas carta = new Cartas((i-39), "Diamante");
        baralho.add(carta);
      }
    }
    for (int i = 0; i < 4; i++) {
      Cartas coringa = new Cartas("Coringa", "Coringa");
      baralho.add(coringa);
    }
  }

  public void embaralhar(){
    for (int i = 0; i < baralho.size(); i++) {
      int cart1 = new Random().nextInt(56);
      int cart2 = new Random().nextInt(56);
      Cartas a = baralho.get(cart1);
      Cartas b = baralho.get(cart2);

      baralho.set(cart2, a);
      baralho.set(cart1, b);
    }
  }
  public Cartas daCarta(){
    return baralho.get(0);
  }
  public Boolean temCarta(){
    return baralho.size() != 0;
  }
  public void imprimirBaralho(){
    for(int i=0; i < baralho.size(); i++) {
      System.out.println(baralho.get(i));
  }
  }
}
