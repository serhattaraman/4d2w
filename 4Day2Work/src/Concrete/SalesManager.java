package Concrete;

import Abstract.SalesService;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class SalesManager implements SalesService {

	@Override
	public void add(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName()+"  Ýsimli Oyun "+user.getName()+"  Ýsimli Kulanýcýnýn Hesabýna Eklendi");
		System.out.println(campaing.getCampaingName()+" Kampanya Uygulandý");
		
		
	}

	@Override
	public void gamegift(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName()+"  Ýsimli Oyun "+user.getName()+"  Ýsimli Kulanýcýnýn Hesabýna Gönderildi");
		System.out.println(campaing.getCampaingName()+" Kampanya Uygulandý");
		

	}

	@Override
	public void refund(Game game, User user, Campaing campaing) {
		System.out.println(game.getGameName()+"  Adlý oyun  "+user.getName()+"  Ýsimli oyuncu tarafýndan iptal edildi");
		System.out.println(game.getPrice()+"  Tutarýnda Ödeme "+user.getName()+" Ýsimli oyuncunun Hesabýna Ýade Edildi");

		
	}
	

}
