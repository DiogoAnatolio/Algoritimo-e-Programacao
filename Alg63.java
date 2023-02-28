import java.util.Scanner;
public class Alg63 {

    public static void main(String[] args) {

		int i;
		int num, maior=0, menor=0;
		int[] vet1 = new int[5];


		Scanner ler = new Scanner(System.in);

		   for(i=0;i < vet1.length;++i){

		   	System.out.println("Escreva 5 números:");
		   	num =ler.nextInt();

		    vet1[i]= num;
		   }

		   System.out.println("");

		   for(i=0;i < vet1.length;++i){

			if(maior<vet1[i]){
				maior=vet1[i];
			}

			if(menor>vet1[i]){
				menor=vet1[i];
			}


		   }

		System.out.println("O menor número so Array é: " + menor);
		System.out.println("O maior número so Array é: " + maior);





    }
}

