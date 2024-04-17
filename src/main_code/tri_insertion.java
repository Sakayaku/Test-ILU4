package main_code;

import java.util.Scanner;

public class tri_insertion {

	public static String anagramme(String mot) {
		String[] anagramme;
		String saisie = mot;
		anagramme = saisie.split("");

		int taille_anagramme = anagramme.length;

		for (int i = 0; i < taille_anagramme; i++) {
			String car = anagramme[i];
			int j = i;
			while ((j > 0) && (car.compareTo(anagramme[j-1].toLowerCase()) < 0)){
				anagramme[j] = anagramme[j-1];
				j = j-1;
			}
			anagramme[j] = car;
		}
		String anagramme_cree = "";
		for (String car : anagramme) {
			anagramme_cree += car;
		}
		return anagramme_cree;
	}
	public static void main(String[] args){
		System.out.println("Entrez le mot dont vous cherchez l'anagramme:");
		Scanner scanner=new Scanner(System.in);
		String annagramme=scanner.nextLine();
		System.out.println("L'anagramme de votre mot est :");
		System.out.println(anagramme(annagramme));
	}
}
