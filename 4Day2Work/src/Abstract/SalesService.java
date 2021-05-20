package Abstract;

import Entities.Campaing;
import Entities.Game;
import Entities.User;

public interface SalesService {
	public void add(Game game,User user,Campaing campaing);
	public void gamegift(Game game,User user,Campaing campaing);
	public void refund(Game game,User user,Campaing campaing);

}
