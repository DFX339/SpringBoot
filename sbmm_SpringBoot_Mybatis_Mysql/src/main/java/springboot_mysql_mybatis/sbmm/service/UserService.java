package springboot_mysql_mybatis.sbmm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import springboot_mysql_mybatis.sbmm.bean.User;
import springboot_mysql_mybatis.sbmm.mapper.UserMapper;

@Service("userService")
@Repository("userService ")
public class UserService implements UserIService{

	@Resource
	private UserMapper userMapper;
	
	@Override
	public void add(User user) {
		user.setUsername("qwe");
		user.setPassword("123");
		user.setAge(12);
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		
		userMapper.update(user);
	}

	@Override
	public void delete(int id) {
		userMapper.delete(id);
	}

	@Override
	public User findById(int id) {
		return userMapper.find(id);
	}

}
