import java.util.Scanner;
public class Alg17 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int idade;

		System.out.println("Escreva sua idade");
		idade =ler.nextInt();

		if (idade <= 12 && idade >= 5) {
		System.out.println("Sua categoria é infantil");

		} else if (idade <= 17 && idade >= 13) {
				System.out.println("Sua categoria é juvenil");

			} else if (idade <= 25 && idade >= 18) {
				System.out.println("Sua categoria é profissional");

				} else {
					System.out.println("Fora da faixa");
				}
	}
}

