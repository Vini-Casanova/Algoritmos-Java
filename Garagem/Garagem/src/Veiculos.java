public class Veiculos {
  private String name;
  private int size;

  Veiculos(String name, int size) {
    setName(name);
    setSize(size);
  }

  public String getName() {
    return name;
  }
  public int getSize() {
    return size;
  }
  private void setName(String name) {
    this.name = name;
  }
  private void setSize(int size) {
    this.size = size;
  }

  @Override
  public String toString() {
    return getName() +" Tamanho: "+ getSize();
  }

  
}
