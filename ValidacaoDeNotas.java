package course;
import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNotas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner (System.in);
		System.out.println("Informe sua nota : ");
		
		double nota = sc.nextDouble();
		
		while (nota > 10) {
			
			System.out.println("===================================");
			
			System.out.println("nota invalida! informe novamente :  ");
			nota = sc.nextDouble();
			
			System.out.println("===================================");
			
		}
		if (nota <= 6  ) {
			System.out.println("Voce foi reprovado! ");
		
		}
		 else if  (nota >= 7 || nota == 10) {
			System.out.println("Parabens! Voce foi Aprovado ");
		}
		
			
			sc.close();
	}
	

		
	}
