import java.util.Scanner;
public class Alg61 {

    public static void main(String[] args) {

		int i, num;
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vet3 = new int[20];


		Scanner ler = new Scanner(System.in);

		   for(i=0;i < vet1.length;++i){

		   	System.out.println("Escreva 10 números:");
		   	num =ler.nextInt();

		    vet1[i]= num;
		   }

		 	for(i=0;i < vet2.length;++i){

		   	System.out.println("Escreva 10 números:");
		   	num =ler.nextInt();

		    vet2[i]= num;
		   }

			for(i=0;i < 10;++i){

		    vet3[i]= vet1[i];
		   }

		   	for(i=0;i <10;++i){

		    vet3[i+10]= vet2[i];
		   }
		   System.out.println("");

		   for(i=0;i < vet3.length;++i){

			System.out.println(vet3[i] + "");
		   }







    }
}

