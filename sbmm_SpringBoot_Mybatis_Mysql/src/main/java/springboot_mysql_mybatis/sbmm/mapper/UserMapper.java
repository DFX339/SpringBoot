package springboot_mysql_mybatis.sbmm.mapper;



import springboot_mysql_mybatis.sbmm.bean.User;

/**
 * 接口方法定义
 * @author Administrator
 */
public interface UserMapper {
	
	public void insert(User user);
	
	public void update(User user);
	
	public User find(int id);
	
	public void delete(int id);
}
