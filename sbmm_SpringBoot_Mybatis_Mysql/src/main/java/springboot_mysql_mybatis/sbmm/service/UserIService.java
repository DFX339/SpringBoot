package springboot_mysql_mybatis.sbmm.service;

import springboot_mysql_mybatis.sbmm.bean.User;

public interface UserIService {
	
	public void add(User user);
	
	public void update(User user);
	
	public void delete(int id);
	
	public User findById(int id);
}
