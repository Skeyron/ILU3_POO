package jeu;

import cartes.*;


public class Joueur {
	
	private String nom;	
	private ZoneDeJeu zone;
	
	private MainJoueur main;

	public Joueur(String nom, ZoneDeJeu zone) {
		super();
		this.nom = nom;
		this.zone = zone;
		main = new MainJoueur();
	}
	
	public void donner(Carte carte) {
		main.prendre(carte);
	}
	
	public Carte prendreCarte(Sabot sabot) {
		if (sabot.estVide()) return null;
		Carte carte = sabot.piocher();
		donner(carte);
		return carte;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Joueur) {
			Joueur joueur = (Joueur) obj;
			return this.nom.equals(joueur.nom);
		}
		return false;

		
	}

	@Override
	public String toString() {
		return "Joueur [nom=" + nom + "]";
	}


}
