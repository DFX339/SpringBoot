package smm.bootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import smm.bootdemo.bean.User;

@Mapper
public interface UserMapper {

	public void insert(User user);

	public void update(User user);
	
	public void delete(int id);
	
	public User find(int id);
}
