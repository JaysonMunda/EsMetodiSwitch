import java.util.Scanner;

public class switchMain {
	
	public static void carVisMat(int m[][]) {
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				m[i][j] = (int)(Math.random() * 50);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] matrix1, matrix2;
		int cell1, cell2;
		int n;
		
		System.out.println("Inserisci il numero di righe della prima matrice:");
		cell1 = sc.nextInt();
		System.out.println("Inserisci il numero di righe della seconda matrice:");
		cell2 = sc.nextInt();
		
		matrix1 = new int [cell1][cell1];
		matrix2 = new int [cell2][cell2];
		
		carVisMat(matrix1);
		carVisMat(matrix2);
		
		System.out.println("Inserisci un numero tra 1 e 4");
		n = sc.nextInt();
		
		switch(n) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			System.err.println("Inserire un numero tra 1 e 4");
			break;
		}

	}

}
