public class App {
    // 9- Desenvolva um programa que faça uma garagem de caros. A classe Garagem deve ser um array de tamanho [20]
    // e deve permitir o estacionamento de carros de diferentes tamanhos, onde: Moto ocupa 1 espaço, Carro popular ocupa 2 espaços
    // e carro 4x4 ocupa 4 espaços
    public static void main(String[] args) throws Exception  {
        System.out.println("Bem vindo ao gerenciador da sua garagem \n A capacidade total é de 20");
        Estacionamento garagem = new Estacionamento();
        while(garagem.getCapacidadeUsada() < 20){
            try {
                System.out.println("Qual vaículo deseja Adicionar?");
                int  escolha = Integer.parseInt(System.console().readLine("1-"+garagem.moto.getName() + " Tamanho: "+ garagem.moto.getSize() + "\n2-" + garagem.carro.getName() +" Tamanho: "+ garagem.carro.getSize()+ "\n3-"+garagem.picape.getName()+" Tamanho: "+garagem.picape.getSize()+"\n"));
                garagem.Adicionar(escolha);
                System.out.println("------------------------------------------------------------------");
                System.out.println("Espaço utilizado: " + garagem.getCapacidadeUsada());
            } catch (Exception e) {
                System.out.println("Carro Inválido");
            }
        }
        for(int i=0; i<garagem.getTamanho();i++){
            System.out.println(garagem.getVeiculo(i)+" Vaga: "+ (i+1));
            System.out.println("-------------------"); 
        }
    }
}
