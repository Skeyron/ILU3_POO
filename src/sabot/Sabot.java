package sabot;
import cartes.*;
import java.lang.Exception;

public class Sabot {
	
	private int nbCartes;
	private Carte[] tab;
	private int i_iterator = 0;
	private boolean next_exist = false;
	
	public Sabot(int nb) {
		this.tab = new Carte[nb];
		this.nbCartes = 0;
	}

	
	public boolean estVide() {
		return nbCartes == 0;
	}
	
	public boolean hasNext() {
		return i_iterator < nbCartes;
	}
	
	public Carte next() {
		if (hasNext()) {
			Carte carte_i = tab[i_iterator];
			i_iterator++;
			next_exist = true;
			return carte_i;
		} else {
			throw new IllegalStateException();
		}
		
	}
	
	public void remove() {
		if (nbCartes < 1 || !next_exist) {
			throw new IllegalStateException();
		}
		for (int i = i_iterator - 1; i < nbCartes; i++) {
			tab[i] = tab[i+1];
		}
		next_exist = false;
		i_iterator --;
		nbCartes --;
		
	}
	public Carte piocher() {
		remove();
		return next();
	}
	
	
	private void ajouterCarte(Carte carte) throws IllegalArgumentException {
		if (nbCartes == tab.length) {
			throw new IllegalArgumentException("tableau plein");
		} else {
			this.tab[nbCartes] = carte; 
		}
	}
	
	public void	ajouterFamille(Carte carte) {
		for (int i = 0; i < carte.getNombre(); i++) {
			try {
				ajouterCarte(carte);
			} catch (Exception e) {
				e.printStackTrace();
			} 
		}
	}
	
	public void	ajouterFamille(Carte[] carte) {
		for (int i = 0; i < carte.length; i++) {
			ajouterFamille(carte[i]);
		}
	}
}
