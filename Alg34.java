import java.util.Scanner;
public class Alg34 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		double num1, somaPositivos, somaNegativos;

		somaPositivos = 0;
		somaNegativos = 0;


		int i = 1;


		while ( i <= 10 ){

			System.out.println("Escreva um número");
			num1 =ler.nextDouble();

			if (num1 > 0){
				somaPositivos = somaPositivos + num1;

			} else {
				somaNegativos = somaNegativos + num1;
			}

			i++;

		}

		System.out.println("A soma dos números positivos é:" + somaPositivos);
		System.out.println("A soma é dos números negativos é:" + somaNegativos);

	}
}

