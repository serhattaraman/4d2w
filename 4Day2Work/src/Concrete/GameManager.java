package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+"  Ýsimli Oyun Baþarýyla Eklendii");
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName()+"  Ýsimli oyun Baþarýyla Güncellendi");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName()+"  Ýsimli oyun Baþarýyla Slindi");
	}

}
