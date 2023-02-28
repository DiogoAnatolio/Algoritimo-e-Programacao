import java.util.Scanner;
public class Alg54 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int num;
		int acumulador =0;

	 	do {
			System.out.println("Escreva notas: ");
			num =ler.nextInt();

			if (num != 0){
                
                if (num > 5){

                    acumulador+=num;
                    
                }
				
			}
		}while(num != 0);

        System.out.println("a soma de todas as notas maiores que 5 é: " + acumulador);
	}
}
