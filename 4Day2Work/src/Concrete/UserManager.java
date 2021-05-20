 package Concrete;

import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService{

	@Override
	public void register(User user) {
		System.out.println(user.getName()+"  Oyuncusu Baþarýyla Eklendi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName()+"  Oyuncusu Baþarýyla Güncellendii");
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName()+"  Oyuncusu Baþarýyla Silindi");
	}
	
	
	
}
