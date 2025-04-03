package cartes;

public class Borne extends Carte {
	
	int km;

	public Borne(int km) {
		this.km = km;
	}
	
	public int getKm() {
		return km;
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj) && km == ((Borne)obj).km;
	}
	
	@Override
	public String toString() {
		String nom = null;
		switch(getKm()) {
		case 25:
			nom =  "25KM";
			break;
		case 50:
			nom = "50KM";
			break;
		case 75:
			nom ="75KM";
			break;
		case 100:
			nom = "100KM";
			break;
		case 200:
			nom = "200KM" 	;
			break;
		}
		return nom;
	}
	
	
}
