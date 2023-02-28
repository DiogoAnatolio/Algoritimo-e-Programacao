import java.util.Scanner;
public class Alg37 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num1, numpar, numimpar;
		int i = 1;
		numpar = 0;
		numimpar = 0;

		while ( i <= 10 ){

			System.out.println("Escreva 10 números ");
			num1 =ler.nextInt();

			if (num1 == 0){

			} else if ( num1%2 == 0 ){

				numpar++;
				i++;


			} else {

				numimpar++;
				i++;
			}

		}

		System.out.println("O ´quantidade de números pares é: " + numpar);
		System.out.println("O ´quantidade de números ímpar é: " + numimpar);

	}
}



