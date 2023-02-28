import java.util.Scanner;
public class Alg5 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int n1, n2, soma;

		System.out.println("Escreva dois numeros");

		n1=ler.nextInt();
		n2=ler.nextInt();
		soma= n1 + n2;

		if (soma > 50) {
			System.out.println("O valor da adição é: " + soma);

		}
	}
}