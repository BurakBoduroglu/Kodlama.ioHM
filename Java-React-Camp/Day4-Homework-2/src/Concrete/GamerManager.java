package Concrete;

import Abstract.IGamerCheckService;
import Abstract.IGamerManager;
import Entities.Gamer;

public class GamerManager implements IGamerManager {

	private IGamerCheckService gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfRealGamer(gamer)) {
			System.out.println(gamer.getFirstName() + " adl� oyuncu sisteme kay�t oldu.");
			
		} else {
			System.out.println(gamer.getFirstName() + " adl� oyuncu sisteme kay�d� ba�ar�s�z oldu.");
		}
	}

	@Override
	public void update(Gamer gamer) {
		 System.out.println("Bilgileriniz G�ncellendi.");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Hesab�n�z Silindi.");
	}

}
