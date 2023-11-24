package cartes;

//import cartes.Carte.Probleme.Bataille;

public class Attaque extends Bataille {

	public Attaque(int nombre, Type type) {
		super(nombre, type);
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Attaque){
			 Attaque attaque = (Attaque) obj;
			 return type.equals(attaque.getType());
		}
		return false;
	}

	
	@Override
	public String toString() {
		String nom;
		switch(getType()) {
			case FEU:
				nom = "FeuRouge";
				break;
			case ESSENCE:
				nom = "PanneDEssence";
				break;
			case CREVAISON:
				nom = "Crevaison";
				break;
			default:
				nom = "Accident";
				break;
		}
		return nom;
		}
}
