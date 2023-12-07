package tokyo.kaisei.dao.after;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import tokyo.kaisei.bean.Users;

@Mapper
public interface UsersMapper {
	
	public Users findUserByUsername(String username);
	
	public Users findUserByUsernamePassword(String username, String password);

}
