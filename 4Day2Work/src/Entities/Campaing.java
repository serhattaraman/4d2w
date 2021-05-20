package Entities;

public class Campaing {
	int campaingid;
	String CampaingName;
	
	public Campaing() {}

	public Campaing(int campaingid, String campaingName) {
		super();
		this.campaingid = campaingid;
		CampaingName = campaingName;
	}

	public int getCampaingid() {
		return campaingid;
	}

	public void setCampaingid(int campaingid) {
		this.campaingid = campaingid;
	}

	public String getCampaingName() {
		return CampaingName;
	}

	public void setCampaingName(String campaingName) {
		CampaingName = campaingName;
	}
	

}
