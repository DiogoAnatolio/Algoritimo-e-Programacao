import java.util.Scanner;
public class Alg41 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num1, acumuPositivo, acumuNegativo, mediaPositivo, mediaNegativo, numeroDeVezes1, numeroDeVezes2;
		int i;
		acumuPositivo = 0;
		acumuNegativo = 0;
		mediaPositivo = 0;
		mediaNegativo = 0;
		numeroDeVezes1 = 0;
		numeroDeVezes2 = 0;

	 	for (i = 1; i <= 5; i++){

			System.out.println("Escreva 5 números ");
			num1 =ler.nextInt();

			if (num1 == 0){

			} else if ( num1 > 0 ){

				acumuPositivo+=num1;
				numeroDeVezes1++;
				mediaPositivo = acumuPositivo/numeroDeVezes1;

			} else {

				acumuNegativo+=num1;
				numeroDeVezes2++;
				mediaNegativo = acumuNegativo/numeroDeVezes2;
			}

		}

		System.out.println("A média dos números positivos é: " + mediaPositivo);
		System.out.println("A média dos números negativo é: " + mediaNegativo);


	}
}

