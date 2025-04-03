package testFonctionnels;

import cartes.JeuDeCartes;


public class TestJeuDeCartes {
	public static void main(String[] args) {
		JeuDeCartes jeu = new JeuDeCartes();
		jeu.afficherJeuDeCarte();
		
		if (!jeu.checkCount()) {
            System.out.println("erreur de nombre");
        }
		
	}
}