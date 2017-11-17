package smm.bootdemo.service;

import org.springframework.stereotype.Component;

import smm.bootdemo.bean.User;

@Component
public interface UserIService {
	
	public void insert(User user);
}
