package tarefa;
import java.util.Scanner;

/**
 * 3. Faça um algoritmo para ler um valor N qualquer (que será o tamanho dos
 * vetores). Após, ler dois vetores A e B (de tamanho N cada um) e depois
 * armazenar em um terceiro vetor Soma a soma dos elementos do vetor A com os do
 * vetor B (respeitando as mesmas posições) e escrever o vetor Soma.
 *
 */
public class Questao3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanhado do Vetor: ");
		int tamanho = input.nextInt();
		
		int vetorA[] = new int[tamanho];
		int vetorB[] = new int[tamanho];
		int soma[] = new int[tamanho];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o valor da posicao:" + (i+1) + " para o Vetor A:  ");
			vetorA[i] = input.nextInt();
			
			System.out.print("Digite o valor da posicao:" + (i+1) + " para o Vetor B:  ");
			vetorB[i] = input.nextInt();
			
			soma[i] = vetorA[i] + vetorB[i];
			System.out.println();
		}
		input.close();
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("[" + vetorA[i] + "]");
		}
		
		System.out.println();
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("[" + vetorB[i] + "]");
		}
		
		System.out.println();
		for (int i = 0; i < soma.length; i++) {
			System.out.print("[" + soma[i] + "]");
		}
	}
}
