public class Cartas {
  private String name;
  private String naipe;

  Cartas(int num, String naipe) {
    if(num == 1){
      setName("A");
    }else if(num == 11){
      setName("Valete");
    }else if(num == 12){
      setName("Rainha");
    }else if(num == 13){
      setName("Rei");
    }else{
      setName(""+num);
    }
    setNaipe(naipe);
  }

  Cartas(String name, String naipe){
    setName(name);
    setNaipe(naipe);
  }

  public String getNaipe() {
    return naipe;
  }
  public String getName() {
    return name;
  }

  private void setNaipe(String naipe) {
    this.naipe = naipe;
  }
  private void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return getName() +" de " + getNaipe();
  }
}
