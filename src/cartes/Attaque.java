package cartes;

//import cartes.Carte.Probleme.Bataille;

public class Attaque extends Bataille {

	public Attaque(Type type) {
		super(type);
	}
	
	
	@Override
	public String toString() {
		Type type = getType();
		return type.getAttaque();
	}
		
}
