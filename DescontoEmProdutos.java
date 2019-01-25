package descontoemprodutos;

public class DescontoEmProdutos {

   
    public static void main(String[] args) {
        System.out.println("====================");
        
        double precoProduto = 80.0;
        System.out.println("O preço do produto é de " + precoProduto + " Reais");
        
        double percentualDesconto = 5.0;
        System.out.println("O Desconto será de " + percentualDesconto + "%");
        
        // REGRA DE 3 PARA DESCOBRIR QUAL O VALOR DO DESCONTO
        double desconto = precoProduto * percentualDesconto / 100;
        
        //PREÇO DO PRODUTO MENOS O DESCONTO
        //PARA SABERMOS O VALOR DO PRODUTO COM O VALOR DO
        //DESCONTO QUE FOI CALCULADO NA LINHA ANTERIOR.
        double precoComDesconto = precoProduto - desconto;
        System.out.println("Com desconto, o produto sai " + "por R$" + precoComDesconto + ".");
        
        System.out.println("FIM!");
        System.out.println("====================");
               
        
        
        
    }
    
}