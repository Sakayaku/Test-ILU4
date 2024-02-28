package MainCode;
import java.util.Scanner;

public class Exercice1 {

	public static String main() {
		System.out.println("Ecrire un mot:");
		Scanner scanner=new Scanner(System.in);
		String saisie=scanner.nextLine();
		String[] anagramme=saisie.split("");
		scanner.close();
		int taille_anagramme=anagramme.length;
		for (int i=0;i<taille_anagramme;i++) {
			String car=anagramme[i];
			int j=i;
			while ((j>0) && (car.compareTo(anagramme[j-1])<0)) {
				anagramme[j]=anagramme[j-1];
				j=j-1;
			}
			anagramme[j]=car;
		}
		String anagrammeRetourne="";
		for (String car: anagramme) {
			anagrammeRetourne+=car;
		}
		return anagrammeRetourne;
	}

}
