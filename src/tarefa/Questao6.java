package tarefa;

/**
 * 6. Escreva uma função que recebe um vetor com o preço de 10 produtos e que
 * exibe os preços dos produtos reajustados em 15%.
 * 
 *
 */
public class Questao6 {
	public static void main(String[] args) {
		
		double[] valores = {2.3, 3.5, 2.2, 4.5, 2.1, 4.6, 22.5, 40.5, 6.3, 1.2};
		produtoReajustados(valores);
	}

	public static void produtoReajustados(double[] valores) {
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("Produto %d: \t%.1f + \t%s = \t%.2f\n", (i+1), valores[i], "15%", valores[i] + (valores[i] * 0.15));
		}
	}
}
