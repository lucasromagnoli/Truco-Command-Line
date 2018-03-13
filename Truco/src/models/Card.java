package models;

import enums.Cards;
import enums.Suits;

public class Card {

	//Atributos
	public Cards card;
	public Suits suit;
	public String name;
	
	//Construtores
	public Card (Cards card, Suits suit) {
		this.card = card;
		this.suit = suit;
		this.name = card.toString() + suit.toString();
	}
	
	@Override
	public String toString() {
		return card.toString() + suit.toString();
	}
}
