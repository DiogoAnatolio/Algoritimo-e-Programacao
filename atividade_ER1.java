import java.util.Scanner;
public class atividade_ER1 {

	public static void main(String[] args)	{

	Scanner ler = new Scanner(System.in);

	int A, B, i,soma;
	i = 0;

	while (i <= 10) {

		System.out.println("Digite dois n�meros para ser apresentado  a soma deles: ");
		A =ler.nextInt();
		B =ler.nextInt();
		soma = A + B;
		System.out.println(" a soma dos almor�tmos �: " + soma);
		i++;

	}

	}
}