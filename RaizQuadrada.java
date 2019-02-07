package course;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class RaizQuadrada {
		
		public static void main(String[] args) {
			Locale.setDefault(Locale.ENGLISH);
			Scanner sc = new Scanner(System.in);

			char resp;
			do {
				System.out.println("Digite um numero: ");
				double n = sc.nextInt();
				double sq = Math.sqrt(n);
				System.out.printf(" Raiz quadrada = %.3f%n", sq);
				System.out.println("Deseja repetir ? y/n ");
				resp = sc.next().charAt(0);
				
			}while (resp != 'n');
			
			
			
			
			
			sc.close();
		}
	}
	