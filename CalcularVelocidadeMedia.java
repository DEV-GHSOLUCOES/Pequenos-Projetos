package calcularvelocidademedia;



// Declaração da classe principal
public class CalcularVelocidadeMedia {

   
    public static void main(String[] args) {
        System.out.println ("====Calcular Velocidade Média====");
         
         //Declaração de variavel distancia percorrida e impressão na tela       
        double distanciaPercorrida = 150;
        System.out.println("À distancia percorrida foi de " 
             + distanciaPercorrida + "km");
        
        //Declaração de variavel tempo gasto e impressao na tela
        double tempoGasto = 1.5;
        System.out.println("O tempo gasto foi de " + tempoGasto + " horas");

        /*Declaração de variavel velocidade media e atribuição 
        do valor do calculo da divisão das variaveis 
        anteriores junto ao comando de impressao na tela.*/
        double velocidadeMedia = distanciaPercorrida/tempoGasto;
        System.out.println("Para encontrar a velocidade media " 
                + "dividimos a distância "
                + "(" + distanciaPercorrida + ") "
                + "pelo tempo gasto no " + "percuso (" + tempoGasto + ").");
        
        //Comando de impressão na tela com o resultado da velocidade media.
        System.out.println("A velocidade média é de "
                + velocidadeMedia + "Km/h");
}
}
	