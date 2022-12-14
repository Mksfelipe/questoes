package tarefa;
import java.util.Scanner;

//1. Faça um algoritmo para ler 20 números e armazenar em um vetor. Após a leitura total dos 20
//números, o algoritmo deve escrever esses 20 números lidos na ordem inversa.
public class Questao1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] numeros = new int[20];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = input.nextInt();
		}
		input.close();
		System.out.println("Vetor com 20 numeros");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		} 
		
		System.out.println("\nVetor invertido com 20 numeros");
		for (int i = numeros.length; i > 0; i--) {
			System.out.print("[" + numeros[i - 1] + "]");
		}
		
	}

}
