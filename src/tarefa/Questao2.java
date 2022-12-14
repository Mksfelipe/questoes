package tarefa;
import java.util.Scanner;

/**
 * 
 * 2. Ler um vetor A de 10 números. Após ler mais um número e guardar em uma
 * variável X. Armazenar em um vetor M o resultado de cada elemento de A
 * multiplicado pelo valor X. Logo após, imprimir o vetor M.
 *
 */

public class Questao2 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = input.nextInt();
		}
		
		System.out.print("Digite mais um numero: ");
		int multiplicador = input.nextInt();
		input.close();
		
		int[] numerosXmultiplicador = new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numerosXmultiplicador[i] = numeros[i] * multiplicador;
		}
		
		System.out.println("Vetor com 10 numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		
		System.out.println("\nVetor multiplicado por: " + multiplicador);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("[" + numerosXmultiplicador[i] + "]");
		}
	}
}
