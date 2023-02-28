import java.util.Scanner;
public class atividade_ER2 {

	public static void main(String[] args)	{

	Scanner ler = new Scanner(System.in);

	int A, i;
	i = 0;

	while (i <= 2) {

		System.out.println("Digite um número: ");
		A =ler.nextInt();
		i++;

		if (A == 0) {
			System.out.println("Número nulo");

		} else if (A > 0){

			System.out.println("Esse número é positivo e o seu valor é: " + A);

		}else {

			System.out.println("Esse número é negativo e o seu valor é: " + A);

		}


		}

	}
}

