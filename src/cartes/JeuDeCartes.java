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
			new Configuration(new Parade(Type.FEU), 5),
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
		
		Carte[] cartes = new Carte[typeCartes.length];
		
		int index = 0;
		
		for (int i = 0; i < typeCartes.length; i++) {
			
			for (int j = 0; j < typeCartes[i].getNbExemplaires(); j++) {
				
				cartes[index] = typeCartes[i].getCarte();
				index ++;
			}
			
		}
		
		return cartes;
		
	}
				
	
	private static class Configuration {
		
		private int nbExemplaires;
		private Carte carte;
		
		public Configuration(Carte carte,int nbExemplaires) {

			this.nbExemplaires = nbExemplaires;
		}
		
		private int getNbExemplaires() {
			return nbExemplaires;
		}

		private Carte getCarte() {
			return carte;
		}
		
	}
	
}
