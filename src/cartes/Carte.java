package cartes;

public abstract class Carte {

	protected Carte() {
	}
	
	
	
	@Override
    public boolean equals(Object obj) {
        return obj.getClass().equals(this.getClass());
    }
	 
}
