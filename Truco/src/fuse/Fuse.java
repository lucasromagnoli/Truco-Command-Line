package fuse;

import models.Game;
import models.Player;

public class Fuse {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		game.players.add(new Player("Lucas", true));
		game.players.add(new Player("CPU 1", false));

		game.Start();
	}
}