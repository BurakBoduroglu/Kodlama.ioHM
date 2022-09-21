import business.concretes.UserEmailManager;
import business.concretes.UserManager;
import business.concretes.VertificationLink;

import core.concretes.GoogleLoggerAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User(1, "Burak", "Boduro�lu", "mail@gmail.com", "1234115685465");
		UserManager manager = new UserManager(new HibernateUserDao(), new UserEmailManager(), new VertificationLink(), new GoogleLoggerAdapter());
			
		System.out.println("\n*****Kay�t A�amas�*****");
		manager.register(user);
		
		System.out.println("\n*****Giri� A�amas�*****");
		manager.LogIn("mail@gmail.com", "1234115685465", user);
		
		System.out.println("\n*****Hesap Silme A�amas�*****");
		manager.deleteAccount(user);
		
		System.out.println("\n*****G�ncelleme A�amas�*****");
		manager.updateAccountData(user);
		
		System.out.println("\n*****Google ile Kay�t A�amas�*****");
		manager.registerWithGoogleAccount(user);
	}

}
