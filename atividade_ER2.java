import java.util.Scanner;
public class atividade_ER2 {

	public static void main(String[] args)	{

	Scanner ler = new Scanner(System.in);

	int A, i;
	i = 0;

	while (i <= 2) {

		System.out.println("Digite um n�mero: ");
		A =ler.nextInt();
		i++;

		if (A == 0) {
			System.out.println("N�mero nulo");

		} else if (A > 0){

			System.out.println("Esse n�mero � positivo e o seu valor �: " + A);

		}else {

			System.out.println("Esse n�mero � negativo e o seu valor �: " + A);

		}


		}

	}
}

