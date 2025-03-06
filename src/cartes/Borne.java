package cartes;

public class Borne extends Carte {
	
	int km;

	public Borne(int km) {
		this.km = km;
	}
	
	public int getKm() {
		return km;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Attaque){
			Borne borne = (Borne) obj;
			 return (km == borne.getKm());
		}
		return false;
	}
	
	@Override
	public String toString() {
		String nom = null;
		switch(getKm()) {
		case 25:
			nom =  "25";
			break;
		case 50:
			nom = "50";
			break;
		case 75:
			nom ="75";
			break;
		case 100:
			nom = "100";
			break;
		case 200:
			nom = "200" 	;
			break;
		}
		return nom;
	}
	
	
}
