import java.util.Scanner;
public class Alg35 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num1, somaGeral;

		somaGeral = 0;

		int i = 1;


		while ( i <= 10 ){

			System.out.println("Escreva um número");
			num1 =ler.nextInt();

			if (num1 < 40){
				somaGeral = somaGeral + num1;

			}

			i++;

		}

		System.out.println("A soma dos números menores que 40 é:" + somaGeral);

	}
}




