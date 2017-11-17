package springboot_mysql_mybatis.sbmm.action;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot_mysql_mybatis.sbmm.bean.User;
import springboot_mysql_mybatis.sbmm.config.MysqlConfig;
import springboot_mysql_mybatis.sbmm.service.UserIService;
import springboot_mysql_mybatis.sbmm.service.UserService;

/**
 * controller类
 * @author Administrator
 *
 */
@RestController
@EnableAutoConfiguration
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Resource
	private MysqlConfig mysqlConfig;
	
	@RequestMapping("/showMysql")
	public String showMysql(){
		return "mysql:"+mysqlConfig.getDriverClassName();
	}
	
	@RequestMapping("/insert")
	public User  insert(){
		User user = new User();
		userService.add(user);
		return userService.findById(user.getId());
	}
	@RequestMapping("/update")
	public User  update(){
		User user = userService.findById(1);
		user.setUsername("星星");
		userService.update(user);
		return userService.findById(user.getId());
	}
	@RequestMapping("/delete")
	public String  delete(){
		userService.delete(1);
		return "删除成功";
	}
	@RequestMapping("/find")
	public User  find(){
		return userService.findById(1);
	}
	
}
