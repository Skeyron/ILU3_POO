package cartes;

//import cartes.Carte.Probleme;

public class Botte extends Probleme {

	public Botte(int nombre, Type type) {
		super(nombre, type);
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Botte){
			 Botte botte = (Botte) obj;
			 return type.equals(botte.getType());
		}
		return false;
	}
	
	@Override
	public String toString() {
		String nom;
		switch(getType()) {
			case FEU:
				nom = "VehiculePrioritaire";
				break;
			case ESSENCE:
				nom = "CiterneDEssence";
				break;
			case CREVAISON:
				nom = "Increvable";
				break;
			default:
				nom = "AsDuVolant";
				break;
		}
		return nom;
	}
}
