 import java.util.Scanner;
public class Alg46 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num = 99, quantN = 0, somaP = 0;


	 	while (num != 0){

			System.out.println("Escreva um número e digite <0> para encerrar o programa: ");
			num =ler.nextInt();

			if (num != 0){

				if (num%2 ==0){
					somaP+=num;
				}else {
					quantN++;
				}

			}
		}

		System.out.println("Quantidade de número negativos é: " + quantN);
		System.out.println("A soma de números positivos é: " + somaP);
	}
}
