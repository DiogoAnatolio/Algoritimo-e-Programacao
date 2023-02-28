 import java.util.Scanner;
public class Alg50 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int nota1 = 0, nota2 = 0, nota3 = 0, mediaClasse = 0;
		String nome =  "a";


	 	while (!"FIM".equals(nome)){

			System.out.println("Escreva o nome do aluno e suas três notas: ");
			nome =ler.nextLine();

			if (!"FIM".equals(nome)){
				nota1 =ler.nextInt();
				nota2 =ler.nextInt();
				nota3 =ler.nextInt();


			}
		}

		System.out.println("O preço da compra é: " + precoT);
	}
}

