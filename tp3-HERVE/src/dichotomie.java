import java.util.Scanner;

public class dichotomie {

	public static int dicho() {
		int c;
		boolean ordonne = false;
		boolean found = false;
		int IndDeb = 0;
		int IndFin;
		int IndMil;

		Scanner scan = new Scanner(System.in);
		System.out.println("entrer nb d'éléments du tableau:");
		int a = scan.nextInt();
		System.out.println("entrer valeur à rechercher:");
		int b = scan.nextInt();

		int[] liste = new int[a];
		IndFin = liste.length - 1;
		for (int k = 0; k < liste.length; k++) {
			liste[k] = (int) (Math.random() * 48) + 1;
		}

		while (ordonne != true) {
			ordonne = true;
			for (int k = 0; k < liste.length - 1; k++) {
				if (liste[k] > liste[k + 1]) {
					c = liste[k];
					liste[k] = liste[k + 1];
					liste[k + 1] = c;
					ordonne = false;
				}
			}

		}
		for (int k = 0; k < liste.length; k++) {
			System.out.println(liste[k]);
		}
		while (found != true && ((IndFin - IndDeb) > 1)) {
			IndMil = (IndDeb + IndFin) / 2;
			found = (liste[IndMil] == b);
			if (liste[IndMil] > b) {
				IndFin = IndMil;
			} else {
				IndDeb = IndMil;
			}
		}
		if (liste[IndDeb] == b) {
			System.out.println("l'indice de l'élément est: " + IndDeb);
			return (IndDeb);
		} else {
			System.out.println("pas de présence de l'élément souhaité: " + 1);
			return (1);
		}

	}

	public static void main(String[] args) {
		dicho();

	}

}
