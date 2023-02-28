import java.util.Scanner;
public class dois_pontos {

    public static void main(String[] args) {



		int num;
		int[] vet1 = new int[10];
	 	int [][]matrizNum = new int[2][5];
		int cnt=0;


		Scanner ler = new Scanner(System.in);

		   for(int i=0;i <=9;++i){

		   	System.out.println("Escreva 10 números:");
		   	num =ler.nextInt();

		    vet1[i]= num;
		   }

		 	for(int a=0; a<=1; a++){
		 		for(int l=0; l<=4; l++ ){
		 			matrizNum[a][l] = vet1[cnt];
		 			cnt++;
		 				System.out.print(matrizNum[a][l]+ " ");
		 		}
		 		System.out.println();
		 	}




    }
}