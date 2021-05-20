import Concrete.CampaingManager;
import Concrete.GameManager;
import Concrete.SalesManager;
import Concrete.UserManager;
import Entities.Campaing;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		User user =new User(1,"Serhat","Serhat_@hotmail.com");
		Game game=new Game(1,"Pes 2021",120);
		Campaing campaing=new Campaing(1,"Yaz Kampanyası");
		
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		gameManager.delete(game);
		
		System.out.println("--------------------------------");
		
		UserManager userManager=new UserManager();
		userManager.register(user);
		userManager.update(user);
		userManager.delete(user);
		
		System.out.println("--------------------------------");
		
		CampaingManager campaingManager=new CampaingManager();
		campaingManager.add(campaing);
		campaingManager.update(campaing);
		campaingManager.delete(campaing);
		
		
		System.out.println("--------------------------------");
		SalesManager salesManager=new SalesManager();
		salesManager.add(game, user, campaing);
		salesManager.gamegift(game, user, campaing);
		salesManager.refund(game, user, campaing);
		
		
		
	
	}

}
