package tokyo.kaisei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tokyo.kaisei.bean.Users;
import tokyo.kaisei.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findUser")
	public Users findUserByUsername(String username) {
		Users user = userService.findUserByUsername(username);
		return user;
	}
	
	@RequestMapping("/login")
	public Users userLogin(String username, String password) {
		Users user = userService.findUserByUsernamePassword(username,password);
		return user;
	}
	
	
	

	
}
