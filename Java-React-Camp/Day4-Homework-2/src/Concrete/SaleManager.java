package Concrete;

import Abstract.ISaleManager;
import Entities.Campaign;
import Entities.Game;

public class SaleManager implements ISaleManager {

	@Override
	public void sellWithCampaign(Game game, Campaign campaign) {
		System.out.println
		("Kampanyal� : " + game.getName() + " oyunu " + game.getPrice() + " fiyat�na " + 
		campaign.getDiscountAmount() + "TL indirim ile sat�ld�." + " Ge�erli Kampanya Ad� : " 
		+ campaign.getName());
	}

	@Override
	public void sellWithoutCampaign(Game game) {
		System.out.println("Kampanyas�z : " + game.getName() + " oyunu " + game.getPrice() + " fiyat�na sat�ld�.");
		
	}

	

}
