import java.util.Scanner;
public class Alg33 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		double num1, soma, media, dobro;

		soma = 0;
		media = 0;
		dobro = 0;

		int i = 1;


		while ( i <= 5 ){

			System.out.println("Escreva um n�mero");
			num1 =ler.nextDouble();

			soma = soma + num1;

			media = (media + num1)/5;

			dobro = soma * 2;

			i++;

		}

		System.out.println("A soma �:" + soma);
		System.out.println("A media �:" + media);
		System.out.println("A dobro �:" + dobro);
	}
}