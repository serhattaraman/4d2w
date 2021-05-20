package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Baþarýyla Eklendi");
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Baþarýyla Güncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Baþarýyla Silindi");
	}
	

}
