package course;

import java.util.Locale;
import java.util.Scanner;

public class CalculoValorTerreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ENGLISH);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a largura do terreno :");
		double largura = sc.nextDouble();
		
		System.out.println("Digite o comprimento do terreno :");
		double comprimento = sc.nextDouble();
		
		System.out.println("Digite o preço do metro quadrado :");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double precoTerreno = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area );
		System.out.printf("PREÇO = %.2f%n", precoTerreno);
		
		sc.close();