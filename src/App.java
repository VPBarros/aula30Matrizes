import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("Digite a quantidades de linhas e colunas");
        	// Matrizes Poo
		//programa para ler (numero inteiros e negativos} de uma Matriz(digite primeiramente numero de linha e coluna EX.3
		//em seguida digite os numeros para prencher linhas e colunas com espaço
		//ao preencher tecle enter; imprimira na tela numeros da diagonal do quadro e os numeros negativos
		//não github
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<mat[i].length; j++) {
			mat[i][j] = sc.nextInt();
		}
		}
		
		System.out.println("valores diagonal:");
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i]+ " ");
		}
		System.out.println();
		
		int count =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] < 0) {
					count++;
				}		
			}		
				
}
	System.out.println("Numeros negativos: "+ count);	
		
		
		sc.close();

	}

}
