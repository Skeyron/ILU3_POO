package cartes;

//import cartes.Carte.Probleme;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}

	@Override
	public String toString() {
		String nom;
		switch(getType()) {
			case FEU:
				nom = "VehiculePrioritaire";
			case ESSENCE:
				nom = "CiterneDEssence";
			case CREVAISON:
				nom = "Increvable";
			default:
				nom = "AsDuVolant";
		}
		return nom;
	}
}
