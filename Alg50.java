 import java.util.Scanner;
public class Alg50 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int preco = 0, quanti = 0, precoT = 0;
		String nome =  "a";


	 	while (!"FIM".equals(nome)){

			System.out.println("Escreva o nome do produto, o pre�o unit�rio e a quantidade desse: ");
			nome =ler.nextLine();

			if (!"FIM".equals(nome)){

				preco =ler.nextInt();
				quanti =ler.nextInt();
				preco= preco*quanti;
				precoT+=preco;
			}

			ler = new Scanner(System.in);
		}

		System.out.println("O pre�o da compra �: " + precoT);
	}
}

