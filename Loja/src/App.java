public class App {
    //DESAFIO DA FATURA DA LOJA E SEUS PEDIDOS COM ITENS
    public static void main(String[] args) throws Exception {
        // Crianção do primeiro objeto comum com os valores esperados
        Fatura obj1 = new Fatura("12345","Cabo SATA",40,10.0);
        System.out.println("Descrição: "+ obj1.getDescricao() +"\nNumero: "+ obj1.getNumero() +"\nQuantidade pedida: " + obj1.getQntd() +"\nPreço:" + obj1.getPreco());

        System.out.println("----------------------------------------------------------------");

        // Criando o segundo objeto Fatura com quantidade e valor negativos
        Fatura obj2 = new Fatura("6789","Memoria RAM",-3,-100.0);
        System.out.println("Descrição: "+ obj2.getDescricao() +"\nNumero: "+ obj2.getNumero() +"\nQuantidade pedida: " + obj2.getQntd() +"\nPreço:" + obj2.getPreco());
        System.out.println("-----------------------------------------------------------");

        // Criando o segundo objeto Fatura com quantidade negativa e valor positivo
        Fatura obj3 = new Fatura("09876","Alcool Isopropílico",-15,70.0);
        System.out.println("Descrição: "+ obj3.getDescricao() +"\nNumero: "+ obj3.getNumero() +"\nQuantidade pedida: " + obj3.getQntd() +"\nPreço:" + obj3.getPreco());
        System.out.println("-----------------------------------------------------------");

        // Criando o segundo objeto Fatura com quantidade positiva e valor negativos
        Fatura obj4 = new Fatura("10293","Processador",20,-5000.0);
        System.out.println("Descrição: "+ obj4.getDescricao() +"\nNumero: "+ obj4.getNumero() +"\nQuantidade pedida: " + obj4.getQntd() +"\nPreço:" + obj4.getPreco());
        System.out.println("-----------------------------------------------------------");

        // Visualização do usuaria com os pedidos feitos
        System.out.println("Fatura do pedido "+ obj1.getNumero() +" = " + obj1.getTotalFatura());
        System.out.println("Fatura do pedido "+ obj2.getNumero() +" = " + obj2.getTotalFatura());
        System.out.println("Fatura do pedido "+ obj3.getNumero() +" = " + obj3.getTotalFatura());
        System.out.println("Fatura do pedido "+ obj4.getNumero() +" = " + obj4.getTotalFatura());
    }
}
