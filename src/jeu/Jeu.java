package jeu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import utils.GestionCartes;
import cartes.Carte;
import cartes.JeuDeCartes;

public class Jeu {
	
	private Sabot sabot;

	
	public Jeu() {	
		
		JeuDeCartes jeu = new JeuDeCartes();
		List<Carte> listeCartes = new ArrayList<>();
		Collections.addAll(listeCartes, jeu.donnerCartes());
		
		GestionCartes.melanger(listeCartes);
		
		Carte[] cartesMelangees = new Carte[0];
		listeCartes.toArray(cartesMelangees);
		
		this.sabot = new Sabot(cartesMelangees);
	}

	public Sabot getSabot() {
		return sabot;
	}
	
	
}
