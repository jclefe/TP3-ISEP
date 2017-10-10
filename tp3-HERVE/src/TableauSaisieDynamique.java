import java.util.Scanner;
public class TableauSaisieDynamique {

	public static int [] Tab4() {
		int i;
		Scanner scan = new Scanner(System.in);
		int [] tab = new int [4];
		for (i=0; i<tab.length;i++) {
			System.out.println ("entrer la valeur de la ligne " + i +":");
		    int a = scan.nextInt();
			tab[i] = a;}
	    for (i=0; i<tab.length;i++) {
	    	System.out.println(tab[i]); }
	    scan.close();
	    return (tab);
	

}
	public static void main(String[] args) {
		Tab4();
		
		
	}
}
