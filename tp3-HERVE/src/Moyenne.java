import java.util.Scanner;
//yann
public class Moyenne {

	public static double moyenne() {
		int t = 0;
		int Sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("entrer nb de lignes du tableau:");
		int a = scan.nextInt();
		System.out.println("entrer nb de colonnes du tableau:");
		int b = scan.nextInt();
		
		int[][] tab = new int[a][b];
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				int c = (int) (Math.random() * 10);
				tab[i][j] = c;
			}
		}
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				System.out.print("" + tab[i][j] + " ");
			}
			System.out.println("");
		}

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				Sum = Sum + tab[i][j];
				t = t + 1;
			}
		}
		System.out.println("la moyenne vaut:" + Sum / t);
		
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[0].length; j++) {
				if (tab[i][j] == Sum/t) {
					System.out.println("l'indice du 1er élément égal à la moyenne est: (" + i + "," + j + ")");
					return (Sum/t);
				}
			}
		}
		scan.close();
		return (Sum/t);
	}
    
	
	

public static void main(String[] args) {
	moyenne();
}
}
