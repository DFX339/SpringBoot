package smm.bootdemo.action;

import javax.annotation.Resource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import smm.bootdemo.bean.User;
import smm.bootdemo.service.UserService;

@RestController
//@EnableAutoConfiguration
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/insert")
	public User insert(){
		User user = new User();
		user.setId(1);
		user.setUsername("1qwe");
		user.setPassword("123");
		user.setAge(16);
		userService.insert(user);
		return user;
	}
	
	@RequestMapping("/update")
	public User update(){
		User user =userService.find(1);
		
		user.setUsername("dddd");
		user.setPassword("qwe");
		user.setAge(1614);
		userService.update(user);
		return user;
	}
	@RequestMapping("/delete")
	public User delete(){
		userService.delete(0);
		User user = userService.find(0);
		return user;
	}
	@RequestMapping("/find")
	public User find(){
		
		return userService.find(1);
	}
	
	
	@RequestMapping("/login")
	public String login(){
		return "true";
	}
}
