import java.util.Scanner;
public class Alg36 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num1, idadem, idadema;
		int i = 1;
		idadem = 0;
		idadema = 0;

		while ( i <= 10 ){

			System.out.println("Escreva uma idade: ");
			num1 =ler.nextInt();

			if (num1 < 21 && num1 > 0){
				idadem++;
				i++;

			} else if ( num1 > 50 ){

				idadema++;
				i++;
			}

		}

		System.out.println("O número de pessoas com menos de 21 anos é: " + idadem);
		System.out.println("O número de pessoas com mais de 50 anos é: " + idadema);

	}
}


51

