package course;
import java.util.Locale;
import java.util.Scanner;

public class MaiorNumeroComFuncao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner (System.in);
		System.out.println("Entre com um numero : ");
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		int maiorNumero = max (n1, n2, n3);
		
		showResult(maiorNumero);
		sc.close();
	}
	
	//criando a função max que retorna valor
	public static int max (int a, int b, int c) {
		int aux;
		
		if (a > b && a > c) {
			aux = a;
		}
		else if (b > a && b > c) {
			aux = b;
			
		}
		else {
			aux = c;
		}
		return aux;
	}
	
	//criando a função showResult que nao retorna valor
	public static void showResult (int value) {
		System.out.println("Maior Numero = " + value);
		
	}

}