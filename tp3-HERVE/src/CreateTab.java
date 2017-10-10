import java.util.Scanner;
public class CreateTab {

public static int [] tableau() {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("entrer nb d'éléments du tableau:");
		int a = scan.nextInt();
		System.out.println ("tableau: ");

		int[] liste = new int[a];
		for (int k = 0; k < liste.length; k++) {
			liste[k] = (int) (Math.random() * 10);
			System.out.println(liste[k]);
			
		}
		scan.close();
		return(liste);

	}


}
