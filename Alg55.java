import java.util.Scanner;
public class Alg55 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int preco = 0, quanti = 0, precoT = 0;
		String nome;


	 	do {
			System.out.println("Escreva o nome do produto, o preço unitário e a quantidade desse: ");
			nome =ler.nextLine();

			if (!"FIM".equals(nome)){

				preco =ler.nextInt();
				quanti =ler.nextInt();
				preco= preco*quanti;
				precoT+=preco;
			}

			ler = new Scanner(System.in);
		} while (!"FIM".equals(nome));

		System.out.println("O preço da compra é: " + precoT);
	}
}
