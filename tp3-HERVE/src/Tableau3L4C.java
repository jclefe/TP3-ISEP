import java.util.Scanner;
public class Tableau3L4C {

	public static int [] [] Tab34() {
		int i;
		int j;
		int [] [] tab = new int [3] [4];
		Scanner scan = new Scanner(System.in);
		for (i=0; i<tab.length; i++) {
			for (j=0; j<tab[0].length; j++) {
				System.out.println("entrer valeur de la ligne " + i + " et de la colonne " + j + ":");
			   int a = (int) (Math.random()*10);
				tab[i][j] = a;
			}
		}
		for (i=0; i<tab.length; i++) {
			for (j=0; j<tab[0].length; j++) { 
				System.out.print("" + tab[i][j] + " ");
			}
			System.out.println("");
	}
scan.close();
return (tab);
}
	public static void main(String[] args) {
		Tab34();
	}
}
