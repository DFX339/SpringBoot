package smm.springboot_ftl.service;

import org.springframework.stereotype.Component;

import smm.springboot_ftl.bean.User;


@Component
public interface UserIService {
	
	public void insert(User user);
}
