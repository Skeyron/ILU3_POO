package cartes;

public class Borne extends Carte {
	
	int km;

	public Borne(int nombre, int km) {
		super(nombre);
		this.km = km;
	}
	
	public int getKm() {
		return km;
	}
	
	@Override
	public String toString() {
		String nom = null;
		switch(getKm()) {
		case 25:
			nom =  "25";
		case 50:
			nom = "50";
		case 75:
			nom ="75";
		case 100:
			nom = "100";
		default:
			nom = "200";
		}
		return nom;
	}

}
