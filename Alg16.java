import java.util.Scanner;
public class Alg16 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int numero1;

		System.out.println("Digite o número 1:");
		numero1 =ler.nextInt();

		if (numero1%5 == 0) {
		System.out.println("Este número é divisível por 5");
		} else  {
				System.out.println("ESte número não é divisível por 5");
			}
	}
}

