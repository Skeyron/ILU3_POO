package cartes;

//import cartes.Carte.Problement.Bataille;

public class Parade extends Bataille {

	public Parade(Type type) {
		super(type);
	}
	
	
	@Override
	public String toString() {
		Type type = getType();
		return type.getParade();
	}
}
