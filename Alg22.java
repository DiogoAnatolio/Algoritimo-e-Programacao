import java.util.Scanner;
public class Alg22 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num1, num2;

		System.out.println("Escreva dois números");
		num1 =ler.nextInt();
		num2 =ler.nextInt();

		if (num1 < num2) {
		System.out.println(" A ordem decrescente é: " + num1 + " " + num2);

		} else  {
			System.out.println(" A ordem decrescente é: " + num1 + " " + num2);

			}
	}
}
