package tokyo.kaisei.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tokyo.kaisei.bean.Users;
import tokyo.kaisei.dao.after.UsersMapper;
import tokyo.kaisei.service.UserService;


@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public Users findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return usersMapper.findUserByUsername(username);
	}

}
