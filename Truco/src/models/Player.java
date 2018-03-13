package models;

import java.util.ArrayList;

public class Player {
	
	//Atributos
	private String name;
	private boolean human;
	
	public ArrayList<Card> hand = new ArrayList<Card>();
	
	
	//Construtores
	
	public Player(String name, boolean human) {
		this.name = name.toUpperCase();
		this.human = human;
	}

	public boolean isHuman() {
		return human;
	}

	public void setHuman(boolean human) {
		this.human = human;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Card> getHand() {
		return hand;
	}

}
