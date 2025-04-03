package cartes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class JeuDeCartes {
	
	private Configuration[] typeCartes = {
			new Configuration (new Botte(Type.FEU),1),
			new Configuration(new Botte (Type.ACCIDENT), 1),
			new Configuration(new Botte(Type.ESSENCE), 1),
			new Configuration(new Botte(Type.CREVAISON), 1),
			
			new Configuration(new Borne(25), 10),
			new Configuration(new Borne(50), 10),
			new Configuration(new Borne(75), 10),
			new Configuration(new Borne(100), 12),
			new Configuration(new Borne(200), 4),
			
			new Configuration(new Attaque(Type.FEU), 5),
			new Configuration(new Attaque(Type.ESSENCE), 3),
			new Configuration(new Attaque(Type.ACCIDENT), 3),
			new Configuration(new Attaque(Type.CREVAISON), 3),
			new Configuration(new DebutLimite(),4),
			
			new Configuration(new Parade(Type.FEU), 14),
			new Configuration(new Parade(Type.ESSENCE), 6),
			new Configuration(new Parade(Type.ACCIDENT), 6),
			new Configuration(new Parade(Type.CREVAISON), 6),
			new Configuration(new FinLimite(),6),
			
	};
	
	public void afficherJeuDeCarte() {
		
		StringBuilder jeu = new StringBuilder();
		
		jeu.append("Jeu :" + "\n");
		
		for (int i = 0; i < typeCartes.length; i++) {
			jeu.append( typeCartes[i].getNbExemplaires());
			jeu.append(" " + typeCartes[i].getCarte().toString() + "\n");
		}
		
		
		System.out.println(jeu);
	}
	
	
	public Carte[] donnerCartes() {
		
		int nombre_cartes = 0;
		
		for (int i = 0; i < typeCartes.length; i++) {
			nombre_cartes += typeCartes[i].getNbExemplaires();
		}
		
		Carte[] cartes = new Carte[nombre_cartes];
		
		int index = 0;
		
		for (int i = 0; i < typeCartes.length; i++) {
			
			for (int j = 0; j < typeCartes[i].getNbExemplaires(); j++) {
				
				cartes[index] = typeCartes[i].getCarte();
				index ++;
			}
			
		}
		
		return cartes;
		
	}
				
	
	public boolean checkCount() {
		Carte[] cartes = donnerCartes();
		
		int totalCartes = cartes.length;
		int compteurBottes = 0;
		int compteurAttaques = 0;
		int compteurParades = 0;
		int compteurBornes = 0;
		int compteurDebutLim = 0;
		int compteurFinLim = 0;
		
		for (Carte carte : cartes) {
			if (carte instanceof Botte)
				compteurBottes++;
			else if (carte instanceof Attaque)
				compteurAttaques++;
			else if (carte instanceof Parade)
				compteurParades++;
			else if (carte instanceof Borne)
				compteurBornes++;
			else if (carte instanceof DebutLimite)
				compteurDebutLim++;
			else if (carte instanceof FinLimite)
				compteurFinLim++;
		}
		
		System.out.println("totalCartes : " + totalCartes);
		System.out.println("bottes : " + compteurBottes);
		System.out.println("atq : " + compteurAttaques);
		System.out.println("par : " + compteurParades);
		System.out.println("borne : " + compteurBornes);
		System.out.println("debut lim : " + compteurDebutLim);
		System.out.println("fin lim : " + compteurFinLim);
		

		return 	(totalCartes == 106) &&
				(compteurBottes == 4) &&
				(compteurAttaques == 14) &&
				(compteurParades == 32) &&
				(compteurBornes == 46) &&
				(compteurDebutLim == 4) &&
				(compteurFinLim == 6);
	}
	
	private static class Configuration {
		
		private int nbExemplaires;
		private Carte carte;
		
		public Configuration(Carte carte,int nbExemplaires) {

			this.nbExemplaires = nbExemplaires;
			this.carte = carte;
		}
		
		private int getNbExemplaires() {
			return nbExemplaires;
		}

		private Carte getCarte() {
			return carte;
		}
		
	}
	
}
