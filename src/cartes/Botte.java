package cartes;

//import cartes.Carte.Probleme;

public class Botte extends Probleme {

	public Botte(Type type) {
		super( type);
	}

	
	
	@Override
	public String toString() {
		Type type = getType();
		return type.getBotte();
	}
}
