 import java.util.Scanner;
public class Alg48 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num = 99, quantP = 0, somaI = 0;


	 	while (num != -1){

			System.out.println("Escreva um número e digite <-1> para encerrar o programa: ");
			num =ler.nextInt();

			if (num != 0){

				if (num%2 ==0){
					quantP++;
				}else {
					somaI+=num;
				}

			}
		}

		System.out.println("Quantidade de números positivos é: " + quantP);
		System.out.println("A soma de números Impares é: " + somaI);
	}
}
