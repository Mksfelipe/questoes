package tarefa;


/**
 * 7. Uma String é utilizada para representar uma das fitas de uma cadeia de
 * DNA. Para tanto, as bases Adenina, Guanina, Citosina, Timina e Uracila são
 * representadas pelas letras A, G, C, T e U, respectivamente. Deseja-se
 * construir uma função que recebe uma sequência de DNA e exibe a sequência de
 * RNA-m equivalente de acordo com a transformação indicada na tabela abaixo.
 * Teste o seu programa para a seguinte fita de uma cadeia de DNA: ATCCGTTAA
 * 
 *
 */
public class Questao7 {
	public static void main(String[] args) {
		String dna = "ATCCGTTAA";
		System.out.println("DNA: " + dna);
		System.out.println("RNA: " + transcribe(dna));
		
	}

	public static String transcribe(String dna) {
		StringBuilder rna = new StringBuilder();
		for (int i = 0; i < dna.length(); i++) {
			if(dna.charAt(i) == 'A') {
				rna.append("U");
			} else if(dna.charAt(i) == 'G') {
				rna.append("C");
			} else if(dna.charAt(i) == 'C') {
				rna.append("G");
			} else if(dna.charAt(i) == 'T') {
				rna.append("A");
			}
		}
		return rna.toString();
	}
}
