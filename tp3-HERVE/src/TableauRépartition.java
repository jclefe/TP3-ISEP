
public class TableauRépartition {

	public static int[] repartition(int[] liste) {
		int t = 0;
		int Sum = 0;
		int a = 0;
		int l;

		for (int k = 0; k < liste.length; k++) {
			Sum = Sum + liste[k];
			t = t + 1;
		}

		System.out.println("la moyenne vaut:" + Sum / t);
		
		if (liste[0] < Sum/t) {
			a += 1;
		}
		for (int i = 1; i < liste.length; i++) {
			if (liste[i] < Sum/t) {
				l = liste[a];
				liste[a] = liste[i];
				liste[i] = l;
				a += 1;
			}
		}
		for (int i = 0; i < liste.length; i++) {
			System.out.println(liste[i]);
		}
		return (liste);
	}

	public static void main(String[] args) {
		int[] liste = CreateTab.tableau();
		repartition(liste);

	}

}
