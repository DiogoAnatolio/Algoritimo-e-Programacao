import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner (System.in);
		String nome;
		int idade;
		float peso;

		System.out.print("Entre com o nome ");
		nome=ler.nextLine();

		System.out.print("Entre com a sua idade ");
		idade=ler.nextInt();

		System.out.print("Entre com o seu peso ");
		peso=ler.nextFloat();

		System.out.println();
		System.out.println("Nome: " + nome + "  idade: " + idade);
		System.out.printf("Peso: %2f ", peso);
	}
}