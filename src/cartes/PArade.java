package cartes;

//import cartes.Carte.Problement.Bataille;

public class PArade extends Bataille {

	public PArade(int nombre, Type type) {
		super(nombre, type);
	}
	
	@Override
	public String toString() {
		String nom;
		switch(getType()) {
		case FEU:
			nom = "FeuVert";
		case ESSENCE:
			nom = "Essence";
		case CREVAISON:
			nom = "RoueDeSecours";
		default:
			nom = "Reparation"; 
		}
		return nom;
	}
}
