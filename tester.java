import java.util.Scanner;
public class tester {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int valA, valB, valC;

		System.out.println("escreva 2 números a seguir");
		valA =ler.nextInt();
		valB =ler.nextInt();

		if (valA == valB) {
			valC = valA + valB;

			} else {

				valC = valA * valB;

				}

		System.out.println("O valor do C é " + valC + ", o valor de A é " + valA + " e o valo de B é " + valB);
	}
}
