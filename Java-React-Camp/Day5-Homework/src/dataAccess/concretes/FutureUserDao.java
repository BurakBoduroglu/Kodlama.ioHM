package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class FutureUserDao implements UserDao {

	@Override
	public void add(User user) {
		System.out.println("FutureUserDao ile kullan�c� eklendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println("FutureUserDao ile kullan�c� silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println("FutureUserDao ile kullan�c� bilgileri g�ncellendi.");
		
	}

}
