package Concrete;

import Abstract.CampaingService;
import Entities.Campaing;

public class CampaingManager implements CampaingService{

	@Override
	public void add(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Başarıyla Eklendi");
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Başarıyla Güncellendi");
		
	}

	@Override
	public void delete(Campaing campaing) {
		System.out.println(campaing.getCampaingName()+"  Kampanya Başarıyla Silindi");
	}
	

}
