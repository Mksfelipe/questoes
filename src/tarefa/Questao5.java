package tarefa;

/**
 * 5. Escreva uma função que receba um Vetor de inteiros de 16 posições e que
 * retorne a soma dos quadrados dos números de posição de índice ímpar contidos
 * no Vetor.
 *
 */
public class Questao5 {

	public static void main(String[] args) {
		int[] numeros = { 2, 1, 6, 1, 7, 1, 10, 1, 4, 1, 10, 1, 36, 1, 14, 13 };

		int soma = somaQuadradosImpar(numeros);

		System.out.println(soma);

	}

	public static int somaQuadradosImpar(int[] vetor) {
		int soma = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 1) {
				soma += vetor[i] * vetor[i];
			}
		}

		return soma;
	}

}
