package tarefa;

/**
 * 
 * 4. Faça um algoritmo para ler e armazenar em um vetor a temperatura média de
 * todos os dias do ano. Calcular e escrever: 
 * a) Menor temperatura do ano 
 * b) Maior temperatura do ano 
 * c) Temperatura média anual 
 * d) O número de dias no ano em que a temperatura foi inferior a média anual
 *
 */
public class Questao4 {
	public static void main(String[] args) {

		double temperaturas[] = new double[365];
		double somaTemperaturas = 0.0;
		double mediaAnual = 0.0;
		double menorTemperatura = 1000;
		double maiorTemperatura = 0.0;
		
		int diaMaiorTemperatura = 0;
		int diaMenorTemperatura = 0;
		
		int diasAbaixoDaMediaAnual = 0;
		
		// gerar temperaturas aleatórias de cada dia do ano
		for (int i = 0; i < 365; i++) {
			temperaturas[i] = 10 + Math.random() * 30; // temperatura entre 20 e 40 graus
		}

		
		for (int i = 0; i < 365; i++) {
			System.out.println("dia: "+(i+1)+" Temperatura: " + temperaturas[i]);
			somaTemperaturas += temperaturas[i];
			if (temperaturas[i] > maiorTemperatura) {
				maiorTemperatura = temperaturas[i];
				diaMaiorTemperatura = (i+1);
			}
			
			if (temperaturas[i] < menorTemperatura) {
				menorTemperatura = temperaturas[i];
				diaMenorTemperatura = (i+1);
			}
		}
		
		mediaAnual = somaTemperaturas / 365;
		for (double temperaturaDia : temperaturas) {
			if (temperaturaDia < mediaAnual) {
				diasAbaixoDaMediaAnual++;
			}
		}
		
		System.out.printf("\nMedia Anual: %.2f", mediaAnual);
		System.out.printf("\nDia %d teve a Maior Temperatura: %.2f", diaMaiorTemperatura, maiorTemperatura);
		System.out.printf("\nDia %d teve a Menor Temperatura: %.2f", diaMenorTemperatura, menorTemperatura);
		System.out.printf("\nO número de dias no ano em que a temperatura foi inferior a média anual: %d", diasAbaixoDaMediaAnual);
	}

}
