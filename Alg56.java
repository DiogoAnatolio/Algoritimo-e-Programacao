import java.util.Scanner;
public class Alg56 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int i=0, num=0, quantiP=0, quantiN=0, somaP=0, somaN=0;
		


	 	do {
			System.out.println("Escreva 15 números: ");
			num =ler.nextInt();

			if (num != 0){

				if (num%2 == 0){
                    
                    quantiP++;
                    somaP+=num;
                }else {
                    quantiN++;
                    somaN=+num;
                }  
                
                i++;
			}

		} while (i < 15);

		System.out.println("A quantidade de números Negativos e Positivos é: " + quantiN + " " + quantiP);
        System.out.println("A soma dos números Negativos e Positivos é: " + somaN + " " + somaP);
	}
}

