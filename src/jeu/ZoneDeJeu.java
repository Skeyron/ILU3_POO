package jeu;

import java.util.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

import cartes.*;


public class ZoneDeJeu {

	private List<Limite> pileLimite;
	private List<Bataille> pileBataille;
	
	public ZoneDeJeu() {
		pileLimite = new ArrayList<>();
		pileBataille = new LinkedList<>();

	}
	
	
	public int donnerLimitationVitesse() {
		if (pileLimite.isEmpty() || pileLimite.getFirst() instanceof FinLimite)
			return 200;
		else 
			return 50;
	}
	
		
}
