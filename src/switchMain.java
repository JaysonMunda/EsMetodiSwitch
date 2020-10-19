import java.util.Scanner;

public class switchMain {
	
	public static void calcMinMax(int m[][], int v[][]) {
		Scanner sc = new Scanner(System.in);
		int r1, r2;
		int min=0, max=0;
		
		System.out.println("Quale riga vuoi nella prima matrice?");
		r1 = sc.nextInt();
		System.out.println("Quale riga vuoi nella seconda matrice?");
		r2 = sc.nextInt();
		
		m = new int[r1][];
		v = new int[r2][];
		
		for(int i=0; i<m[r1].length; i++) {
			if(m[r1][i] < min) {
				min = m[r1][i];
			}
			if(m[r1][i] > max) {
				max = m[r1][i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
	
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
		
		do {
			System.out.println("Inserisci un numero tra 1 e 4");
			n = sc.nextInt();
		} while (n<1 || n>4);
		
		switch(n) {
		case 1:
			calcMinMax(matrix1, matrix2);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			//System.err.println("Inserire un numero tra 1 e 4");
			break;
		}
		

	}

}
