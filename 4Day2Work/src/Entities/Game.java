package Entities;

public class Game {
	int Game›d;
	String GameName;
	int Price;

	public Game() {
		
	}

	public Game(int game›d, String gameName, int price) {
		super();
		Game›d = game›d;
		GameName = gameName;
		Price = price;
	}

	public int getGame›d() {
		return Game›d;
	}

	public void setGame›d(int game›d) {
		Game›d = game›d;
	}

	public String getGameName() {
		return GameName;
	}

	public void setGameName(String gameName) {
		GameName = gameName;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}
	

}
