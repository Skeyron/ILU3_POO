package testFonctionnels;

import java.util.Iterator;

import cartes.Botte;
import cartes.Carte;
import cartes.JeuDeCartes;
import jeu.Sabot;

public class TestSabot {
	JeuDeCartes jeu = new JeuDeCartes();
	Sabot sabot = new Sabot(jeu.donnerCartes());

	// 4.2.a
	public void questionA() {

		while (!sabot.estVide()) {
			Carte carte = sabot.piocher();
			System.out.println("Je pioche " + carte);
		}
//		Console :
//		Je pioche Accident
//		Je pioche Accident
//		Je pioche Accident
//		Je pioche R�paration
//		Je pioche R�paration
//		Je pioche R�paration
//		Je pioche As du volant
	}

	// 4.2.b
	public void questionB() {
		for (Iterator<Carte> iterator = sabot.iterator(); iterator.hasNext();) {
			System.out.println("Je pioche " + iterator.next());
			iterator.remove();
		}
	}

	// 4.2.c
	public void questionC() throws IllegalAccessException {
		Carte cartePiochee = sabot.piocher();
		System.out.println("Je pioche " + cartePiochee);
		for (Iterator<Carte> iterator = sabot.iterator(); iterator.hasNext();) {
			Carte carte = iterator.next();
			System.out.println("Je pioche " + carte);
			iterator.remove();
			cartePiochee = sabot.piocher();
			sabot.ajouterCarte(new Botte(cartes.Type.ACCIDENT));
		}
		Iterator<Carte> iterator = sabot.iterator();
		System.out.println("\n La pioche contient encore des cartes ? " + iterator.hasNext());
	}

	public static void main(String[] args) throws IllegalAccessException {
		TestSabot testPioche = new TestSabot();
//		testPioche.questionA();
//		testPioche.questionB();
//		testPioche.questionC();
	}

}