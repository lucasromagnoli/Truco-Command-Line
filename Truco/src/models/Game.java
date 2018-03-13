package models;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import enums.Cards;
import enums.Suits;

public class Game {

	//Atributos
	public ArrayList<Card> deck = new ArrayList<Card>();
	public ArrayList<Player> players = new ArrayList<Player>();
	public int turn;
	//Construtores
	public Game() {
		for (int number = 0; number < 13; number++) {
			for (int suits = 0; suits < 4; suits++) {
				this.deck.add(new Card(Cards.values()[number],Suits.values()[suits]));
			}
		}
	}
	
	// Metodos
	public void Start() {
		int playerRandom = ThreadLocalRandom.current().nextInt(0, players.size());
		System.out.println("O Jogo está sendo caregado... \n");
		
		//Informações dos jogadores:
		for (int i = 0; i < players.size(); i++) {
			System.out.println("Jogador["+(i+1)+"]: "+players.get(i).getName());
		}
		
		//Quem começa (Jogador escolhido é o responsável por cortar o baralho e escolher se vai subir ou descer)
		System.out.println("Jogador escolhido aleatoriamente: "+players.get(playerRandom).getName());
		this.turn = playerRandom;
		
		//Embaralha e corta o baralho e decide se sobe ou desce.
		
		
		//Distribui as cartas
		players.get(1).hand.add(deck.get(51));
		System.out.println(players.get(1).hand.get(0));
		
		//Vira uma carta na mesa
		
		Turn();
	}
	
	public void Turn() {
		Player player = players.get(turn);
		System.out.println("Turno de: "+player.getName());
		if (player.isHuman()) {
			System.out.println("Escolha uma carta para jogar -> ");
		}
	}
	
}