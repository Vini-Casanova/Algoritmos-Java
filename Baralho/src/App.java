public class App {
    public static void main(String[] args) throws Exception {
        Baaralho baralho = new Baaralho();

        System.out.println("--------------------------------");
        System.out.println("Baralho possui cartas?:"+ baralho.temCarta());
        System.out.println("Primeira Carta no barálho é: "+ baralho.daCarta());
        baralho.imprimirBaralho();
        baralho.embaralhar();

        System.out.println("--------------------------------");
        System.out.println("Baralho possui cartas?:"+ baralho.temCarta());
        System.out.println("Primeira Carta no barálho é: "+ baralho.daCarta());
        baralho.imprimirBaralho();

        
        

    }
}
