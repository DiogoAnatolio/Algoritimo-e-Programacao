import java.util.Scanner;
public class Alg42 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int notaFinal, totalNotas, mediaNotas, quantiAlunos70, quantiAlunos20, idade;
		int i;
		mediaNotas = 0;
		quantiAlunos70 = 0;
		quantiAlunos20 = 0;
		totalNotas = 0;
		idade = 0;
		notaFinal = 0;

	 	for (i = 0; i < 30; i++){

			System.out.println("Escreva sua nota final: ");
			notaFinal =ler.nextInt();

			System.out.println("Escreva sua idade: ");
			idade =ler.nextInt();

			totalNotas+=notaFinal;
			if (notaFinal > 70){

				quantiAlunos70++;
			}

			if ( idade > 20 ){
				quantiAlunos20++;
			}



		}
		mediaNotas= totalNotas/i;
		System.out.println("quantidade de alunos com nota final acima de 70 pontos é: " + quantiAlunos70
			);
		System.out.println("quantidade de alunos com idade superior a 20 anos é: " + quantiAlunos20);
		System.out.println("média das notas finais da turma é: " + mediaNotas);
	}
}

