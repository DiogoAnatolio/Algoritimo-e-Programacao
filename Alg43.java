import java.util.Scanner;
public class Alg43 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int nota = 0, mediaClasse = 0, quantiAprovados = 0, quantiReprovados = 0, quantiNota = 0;
		int i;
		String nome;


	 	for (i = 0; i < 2; i++){

			System.out.println("Escreva seu nome: ");
			nome =ler.nextLine();

			System.out.println("Escreva sua nota: ");
			nota =ler.nextInt();

			quantiNota+=nota;

			if (nota >= 60){

				quantiAprovados++;
			}

			if (nota < 60){
				quantiReprovados++;
			}



		}
		mediaClasse = quantiNota/i;
		System.out.println("m�dia das notas finais da turma �: " + mediaClasse);
		System.out.println("Quantidade de alunos aprovados �: " + quantiAprovados);
		System.out.println("Quantidade de alunos reprovados �: " + quantiReprovados);
	}
}


