package Concrete;

import Abstract.ICampaignManager;
import Entities.Campaign;

public class CampaignManager implements ICampaignManager {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyas� Eklendi");
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyas� Silindi");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " Kampanyas� G�ncellendi");
		
	}
	

}
