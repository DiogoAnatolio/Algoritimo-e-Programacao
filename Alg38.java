import java.util.Scanner;
public class Alg38 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num1, numpositivo, numnegativo, somaposi, somanega;
		int i = 1;
		numpositivo = 0;
		numnegativo = 0;
		somaposi = 0;
		somanega = 0;

		while ( i <= 15 ){

			System.out.println("Escreva 15 números ");
			num1 =ler.nextInt();

			if (num1 == 0){

			} else if ( num1 > 0 ){

				numpositivo++;
				somaposi = somaposi + num1;
				i++;


			} else {

				numnegativo++;
				somanega = somanega + num1;
				i++;
			}

		}

		System.out.println("A quantidade de números positivos é: " + numpositivo);
		System.out.println("A quantidade de números negativos é: " + numnegativo);
		System.out.println("A soma de números positivos é: " + somaposi);
		System.out.println("A soma de números negativos é: " + somanega);

	}
}




