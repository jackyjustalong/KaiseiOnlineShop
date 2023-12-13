package tokyo.kaisei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/login")
	public Users userLogin(@RequestBody Users loginUser) {
		 // Assuming Users class has fields 'username' and 'password'
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();
		
		Users user = userService.findUserByUsernamePassword(username,password);
		return user;
	}
}
