package testFonctionnels;


import cartes.*;
import cartes.Probleme.Type;
import sabot.Sabot;

public class SabotTest {
	
	public static void main(String[] args) {
		
		Sabot sabot_1 = new Sabot(110);
		
		Carte[] cartes = new Carte[3];
		
		cartes[0] = new Attaque(3, Type.ACCIDENT);
		cartes[1] = new Parade( 3, Type.ACCIDENT );
		cartes[2] = new Botte(1, Type.ACCIDENT);
				
		sabot_1.ajouterFamille(cartes);
		
		
		while (!sabot_1.estVide()) {
			System.out.println("Je pioche " + sabot_1.piocher().toString()); 	
		}
		
		System.out.println("\n ********** \n");
		
		
		cartes[0] = new Attaque(3, Type.ACCIDENT);
		cartes[1] = new Parade( 3, Type.ACCIDENT );
		cartes[2] = new Botte(1, Type.ACCIDENT);
				
		sabot_1.ajouterFamille(cartes);
		
		while (!sabot_1.estVide()) {
			System.out.println("Je pioche " + sabot_1.next().toString() ); 
			sabot_1.remove();
			
			sabot_1.piocher();
			cartes[0] = new Botte( 3, Type.ACCIDENT );
		}
			
	}

}