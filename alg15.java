import java.util.Scanner;
public class alg15 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int numeroGols1, numeroGols2;

		String time1, time2;

		System.out.println("Digite o nome do time 1:");
		time1 =ler.nextLine();

		System.out.println("Digite o nome do time 2:");
		time2 =ler.nextLine();

		System.out.println("Digite o numero de gols marcados na partida do " + time1);
		numeroGols1 =ler.nextInt();

		System.out.println("Digite o numero de gols marcados na partida do " + time2);
		numeroGols2 =ler.nextInt();



		if (numeroGols1 == numeroGols2) {

		System.out.println("Empate!!");
		} else if (numeroGols1 >= numeroGols2) {
				System.out.println("O " + time1 + " ganhou!!");
			} else {
				System.out.println("O" + time2 + "ganhou!!");
			}

	}
}

