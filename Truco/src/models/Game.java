package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import enums.Cards;
import enums.Suits;

public class Game {

	//Atributos
	public ArrayList<Card> deck = new ArrayList<Card>();
	public ArrayList<Player> players = new ArrayList<Player>();
	public Player turn;
	Scanner scanner = new Scanner (System.in);
	
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
		turn = players.get(ThreadLocalRandom.current().nextInt(0, players.size()));
		System.out.println("O Jogo est� sendo caregado... \n");
		
		//Informa��es dos jogadores:
		for (int i = 0; i < players.size(); i++) {
			System.out.println("Jogador["+(i+1)+"]: "+players.get(i).getName());
		}
		
		//Quem come�a (Jogador escolhido � o respons�vel por cortar o baralho e escolher se vai subir ou descer)
		System.out.println("Jogador escolhido aleatoriamente: "+turn.getName());

				//Embaralha e corta o baralho e decide se sobe ou desce.
		//Embaralha o baralho
		System.out.println("O baralho est� sendo embaralhado...");
		Collections.shuffle(deck);
		
		//Cortando o baralho
		System.out.println("O jogador respons�vel por cortar o baralho: "+turn.getName());
		if (turn.isHuman()) {
			System.out.println("Escolha entre: topo, centro ou inferior.");
			scanner.nextLine();
		}
		
		
		
		//Distribui as cartas
		players.get(1).hand.add(deck.get(51));
		System.out.println(players.get(1).hand.get(0));
		
		//Vira uma carta na mesa
		
		Turn();
	}
	
	public void Turn() {
		System.out.println("Turno de: "+turn.getName());
		if (turn.isHuman()) {
			System.out.println("Escolha uma carta para jogar -> ");
		}
	}
	
	public void Cut(String cut) {
		for (int i = 0; i < deck.size(); i++) {
			
		}
	}
	
}