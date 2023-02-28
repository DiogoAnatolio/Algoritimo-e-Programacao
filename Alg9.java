import java.util.Scanner;
public class Alg9 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		float altura, base, vArea;

		System.out.println("DIgite primeiro a altura do triângulo");
		altura=ler.nextFloat();

		System.out.println("Agora digite o valor da base do triângulo");
		base=ler.nextFloat();

		vArea = (base*altura/2);

		System.out.printf("O valor da área é:" + vArea);
	}
}