import java.util.Scanner;
public class atividade_dia_4 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int valA, valB, valC, valZ;

		System.out.println("Escreva dois n�meros");
		valA =ler.nextInt();
		valB =ler.nextInt();

		if (valA != valB) {

		valC = valA;
		valZ = valB;
		valA = valZ;
		valB = valC;

		System.out.println("Agora o valor do primeiro n�mero �: " + valA);
		System.out.println("Agora o valor do segundo n�mero �: " + valB);

		} else  {

			valC = valA;
			valZ = valB;
			valA = valZ;
			valB = valC;

			System.out.println("Agora o valor do primeiro n�mero �: " + valA);
			System.out.println("Agora o valor do primeiro n�mero �: " + valB);

			}
	}
}