
public class Exhaustive {

	public static int exhaust(int [] liste, int v) {

		for (int i = 0; i < liste.length; i++) {
			if (liste[i] == v) {
				System.out.println("l'indice du 1er élément du tableau égal à l'entier est: " +  i);
				return (i);
				} else {
					System.out.println("l'entier recherché n'est pas présent dans la " + i + "ième case");
					
				}
			}
		return 0;
		}

// si v est au début, il faut une itération.
//si v est à la fin, il faut liste.length itérations.
// en moyenne il faut (liste.length/2) itérations.
		
		
	
    
	
	

public static void main(String[] args) {
	int [] liste = CreateTab.tableau();
	exhaust(liste, 5);   // par exemple on pose v = 5
}



	

}
