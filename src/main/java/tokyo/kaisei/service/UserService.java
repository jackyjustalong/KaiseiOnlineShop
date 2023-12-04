package tokyo.kaisei.service;

import tokyo.kaisei.bean.Users;

public interface UserService {
	
	public Users findUserByUsername(String username);

}
