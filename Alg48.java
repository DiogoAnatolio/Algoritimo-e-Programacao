 import java.util.Scanner;
public class Alg48 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num = 99, quantP = 0, somaI = 0;


	 	while (num != -1){

			System.out.println("Escreva um n�mero e digite <-1> para encerrar o programa: ");
			num =ler.nextInt();

			if (num != 0){

				if (num%2 ==0){
					quantP++;
				}else {
					somaI+=num;
				}

			}
		}

		System.out.println("Quantidade de n�meros positivos �: " + quantP);
		System.out.println("A soma de n�meros Impares �: " + somaI);
	}
}
