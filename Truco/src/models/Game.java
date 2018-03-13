package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

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
		createDeck();
	}
	
	// Metodos
	public void Start() {
		turn = players.get(ThreadLocalRandom.current().nextInt(0, players.size()));
		System.out.println("O Jogo está sendo caregado... \n");
		
		//Informações dos jogadores:
		for (int i = 0; i < players.size(); i++) {
			System.out.println("Jogador["+(i+1)+"]: "+players.get(i).getName());
		}
		
		//Quem começa (Jogador escolhido é o responsável por cortar o baralho e escolher se vai subir ou descer)
		System.out.println("Jogador escolhido aleatoriamente: "+turn.getName());

		//Embaralha o baralho
		System.out.println("O baralho está sendo embaralhado...");
		Collections.shuffle(deck);
		
		//Cortando o baralho
		System.out.println("O jogador responsável por cortar o baralho: "+turn.getName());
		if (turn.isHuman()) {
			System.out.println("Escolha entre: topo, centro ou inferior.");
			Cut(scanner.nextLine().toLowerCase());
			
		} else {
			Cut(ThreadLocalRandom.current().nextInt(0,1) == 0 ? "topo" : ThreadLocalRandom.current().nextInt(0,1) == 1 ? "centro" : "inferior");
		}
		
		
		
		//Distribui as cartas
		players.get(1).hand.add(deck.get(1));
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
		JOptionPane.showMessageDialog(null, cut);
		for (int i = 0; i < deck.size(); i++) {
			if (cut.equals("topo") && i < 11) {
				deck.remove(i);
			} else if (cut.equals("centro") && i > 11 && i < 23) {
				deck.remove(i);
			} else if (cut.equals("inferior") && i > 40) {
				deck.remove(i);
			}
		}
	}
	
	public void createDeck() {
		for (int number = 0; number < 13; number++) {
			for (int suits = 0; suits < 4; suits++) {
				this.deck.add(new Card(Cards.values()[number],Suits.values()[suits]));
			}
		}
	}
	
}