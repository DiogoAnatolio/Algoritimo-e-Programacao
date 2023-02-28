import java.util.Scanner;
public class Alg53 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int mediaClasse = 0, totaoN =0;
		int num, contador = 0;

	 	do {
			System.out.println("Escreva notas: ");
			num =ler.nextInt();

			if (num != 0){

				totaoN+=num;
				contador++
			}
		}while(num != 0);

		mediaClasse= num/contador


		System.out.println("A media dos números é " + mediaClasse);
	}
}

