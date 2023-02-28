import java.util.Scanner;
public class Alg62 {

    public static void main(String[] args) {

		int i;
		double num;
		double[] vet1 = new double[10];
		double[] vet2 = new double[10];


		Scanner ler = new Scanner(System.in);

		   for(i=0;i < vet1.length;++i){

		   	System.out.println("Escreva 10 números:");
		   	num =ler.nextDouble();

		    vet1[i]= num;
		   }

		 	for(i=0;i < vet2.length;++i){

		    vet2[i]= vet1[i]*1.1;
		   }

		   System.out.println("");

		   for(i=0;i < vet2.length;++i){

			System.out.println(vet2[i] + "");
		   }







    }
}

