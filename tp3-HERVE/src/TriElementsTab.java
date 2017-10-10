
public class TriElementsTab {

	public static int[] TriTab(int[] liste) {
		int c;
		boolean ordonne = false;
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
		System.out.println("tableau trié:");
		for (int k = 0; k < liste.length; k++) {
			System.out.println(liste[k]);
		}
		return (liste);

	}

	public static void main(String[] args) {
		int[] liste = CreateTab.tableau();
		TriTab(liste);
	}
}
