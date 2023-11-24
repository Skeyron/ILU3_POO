package cartes;

//import cartes.Carte.Problement.Bataille;

public class Parade extends Bataille {

	public Parade(int nombre, Type type) {
		super(nombre, type);
	}
	
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Parade){
			Parade parade = (Parade) obj;
			 return type.equals(parade.getType());
		}
		return false;
	}
	
	@Override
	public String toString() {
		String nom;
		switch(getType()) {
		case FEU:
			nom = "FeuVert";
			break;
		case ESSENCE:
			nom = "Essence";
			break;
		case CREVAISON:
			nom = "RoueDeSecours";
			break;
		default:
			nom = "Reparation"; 
			break;
		}
		return nom;
	}
}
