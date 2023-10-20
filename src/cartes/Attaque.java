package cartes;

//import cartes.Carte.Probleme.Bataille;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		String nom;
		switch(getType()) {
			case FEU:
				nom = "FeuRouge";
			case ESSENCE:
				nom = "PanneDEssence";
			case CREVAISON:
				nom = "Crevaison";
			default:
				nom = "Accident";
		}
		return nom;
		}
}
