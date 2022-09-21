package business.concretes;

import business.abstracts.VertificationService;
import entities.concretes.User;

public class VertificationLink implements VertificationService {

	@Override
	public void vertification(User user) {
		System.out.println(user.getName() + " Kullan�c�s�n�n bilgileri do�rulan�yor.");
	}

}
