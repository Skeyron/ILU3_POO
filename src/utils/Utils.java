package utils;

import java.util.List;
import java.util.Random;

import cartes.Carte;


public class Utils {
	
	
	private static <E> E extraire(List<E> liste) {
		
		Random rand = new Random();
		E elem = liste.get(rand.nextInt(liste.size()));
		liste.remove(rand.nextInt(liste.size()));
		
		return elem;
	}
}
