
public class UserManager {
	
	public void registerAccount(User user) {
		System.out.println(user.getName()+ " " +user.getLastName() + " sistem de kayd�n�z olu�tu.");
	}
	public void deleteAccount(User user) {
		System.out.println(user.getName()+ " " +user.getLastName() + " sistem de kayd�n�z silindi.");
	}

}
