import java.util.Scanner;
public class atividade_ER3 {

	public static void main(String[] args)	{

	Scanner ler = new Scanner(System.in);

	int A, i, numerosPositivos, numerosNegativos;
	numerosPositivos = 0;
	numerosNegativos = 0;
	i = 0;

	while (i <= 2) {

		System.out.println("Digite um n�mero: ");
		A =ler.nextInt();
		i++;

		if (A == 0) {
			System.out.println("N�mero nulo");

		} else if (A > 0){

			numerosPositivos++;

		}else {

			numerosNegativos++;
		}


		}

	System.out.println("A quantidade de n�meros positivos �: " + numerosPositivos);
	System.out.println("A quantidade de n�meros negativos �: " + numerosNegativos);
	}
}

